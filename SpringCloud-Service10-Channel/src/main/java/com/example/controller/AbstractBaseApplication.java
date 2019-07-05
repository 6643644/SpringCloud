package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.example.session.UserSession;
import com.example.session.UserSession2;

/******************************************************************************************
 * @author Miles
 * 
 * Session的基本概念
 * 1. session存放在server端
 * 2. session容易與cookie混淆
 * 3. Session 之所以會存在，是因為 HTTP 為 stateless 的設計，Server 和 Client 不會一直保持連線狀態，也不會有雙方狀態的即時更新，
 *    所以，Server 並不知道 Client 的狀態（像是是否已經登入）。因此，後來的網站開發者，採用 Session 這樣的設計來解決這問題。
 * 4. Cookie-based Session概念:指的是儲存資料方式的不同最原始的 Session 設計，大多開發者都將資料存在 Server 上 
 *    針對大量的server session 需要特別注意一個用法Cookie-based Session 就被提出為一個解決方案，把資料暫存放在 Cookie 中，
 *    讓 Client 自己負責保存。簡單來說，就是把你點什麼飲料，通通直接寫在號碼牌上。
 *    Server 就可以直接看你的號碼牌上寫了什麼，而不必花大量時間去後面建立大規模的 Server 來處理 Session 。
 *         
 * 5. 再分散式系統當中，HttpSession很可能被分散至不同的server上面，那如何達到session共享的的機制?
 *    最簡單的方式就是....將session管理容器獨立出來，其中實作方式有很多種:
 *    1.
 *    2.
 *    3.使用框架提供的會話管理工具例如，spring-session
 *         
 *    Channel專案 練習使用spring-session
 *         
 * 參考網站:https://codertw.com/%E8%B3%87%E6%96%99%E5%BA%AB/16910/ 
 *        
 *         
 *         
 * 
 *******************************************************************************************/
public abstract class AbstractBaseApplication extends SpringBootServletInitializer {

	HttpServletRequest httpServletRequest;

	public void init(HttpServletRequest thishttpServletRequest) {
		this.httpServletRequest = thishttpServletRequest;
	}

	/**
	 * session時間設置
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		//java 7以前寫法
		//		return new EmbeddedServletContainerCustomizer() {
		//			@Override
		//			public void customize(ConfigurableEmbeddedServletContainer Container) {
		//
		//				Container.setSessionTimeout(12 * 60 * 60);
		//			}
		//		};

		//java 8的lambda寫法
		return (ConfigurableEmbeddedServletContainer container) -> {
			container.setSessionTimeout(12 * 60 * 60);
		};
	}

}
