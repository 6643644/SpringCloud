package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.example.session.UserSession;
import com.example.session.UserSession2;

/******************************************************************************************
 * @author Miles
 * 
 *         練習session的基本概念
 *         1.session存放在server端
 *         2.session容易與cookie混淆
 *         
 *         參考:Session 之所以會存在，是因為 HTTP 為 stateless 的設計，
 *         Server 和 Client 不會一直保持連線狀態，也不會有雙方狀態的即時更新，
 *         所以，Server 並不知道 Client 的狀態（像是是否已經登入）。
 *         因此，後來的網站開發者，採用 Session 這樣的設計來解決這問題。
 *         
 *         1.Cookie-based Session概念:指的是儲存資料方式的不同
 *         最原始的 Session 設計，大多開發者都將資料存在 Server 上
 *         
 *         針對大量的server session 需要特別注意一個用法
 *         Cookie-based Session 就被提出為一個解決方案，把資料暫存放在 Cookie 中，
 *         讓 Client 自己負責保存。簡單來說，就是把你點什麼飲料，通通直接寫在號碼牌上。
 *         Server 就可以直接看你的號碼牌上寫了什麼，而不必花大量時間去後面建立大規模的 Server 來處理 Session 。
 *         
 *         可以參考URL:http://fred-zone.blogspot.com/2014/01/web-session.html
 *         
 *         
 *         因為使用分散式系統方式，所以session會因為在不同的系統導致不同的sessionId(甚至session沒有建立)，故該方法需要使用
 *         spring-session redis方式可以處理或者是用其他傳統方式處理
 *         
 *        
 *         
 *         
 * 
 *******************************************************************************************/
public abstract class AbstractBaseApplication extends SpringBootServletInitializer {

	HttpServletRequest httpServletRequest;

	@Autowired
	protected StringRedisTemplate redisTemplate;

	@Autowired
	private ApplicationContext context;

	public void init(String key, HttpServletRequest thishttpServletRequest) {
		this.httpServletRequest = thishttpServletRequest;

		//		UserSession userSession = context.getBean(UserSession.class);
		//
		//		if (userSession != null) {
		//			System.out.println("UserSession is not null,user id is " + userSession.getId());
		//			userSession.setId(id);
		//			userSession.setName("XXX");
		//
		//		} else {
		//			System.out.println("UserSession is null");
		//		}

		//		if (httpServletRequest.getRequestedSessionId() == null) {
		//			System.out.println("httpServlerReuest Session is null");
		//			httpServletRequest.getSession(true).setAttribute("ID", userSession);
		//		}else{
		//			System.out.println("httpServlerReuest Session is not null");
		//			System.out.println("httpServlerReuest Session id is:"+httpServletRequest.getRequestedSessionId());
		//			httpServletRequest.getSession(false).setAttribute("ID", userSession);
		//		}

		if (!this.existsUserSession(key)) {
			UserSession2 userSession2 = new UserSession2();
			userSession2.setKey(key);
			this.setSession(key, userSession2);
		} else {
			UserSession2 userSession2 = this.getSession(key);
			System.out.println("session exists key is:" + key);
			System.out.println("session exists key value is:" + userSession2.getKey());

		}

	}

	public boolean existsUserSession(final String key) {
		boolean result = false;
		System.out.println(redisTemplate);
		result = redisTemplate.hasKey(key);
		return result;
	}

	public void setSession(String key, UserSession2 userSession) {
		ValueOperations operations = redisTemplate.opsForValue();
		operations.set(key, userSession);
	}

	public UserSession2 getSession(final String key) {
		ValueOperations operations = redisTemplate.opsForValue();
		UserSession2 userSession2 = (UserSession2) operations.get(key);
		return userSession2;
	}
}
