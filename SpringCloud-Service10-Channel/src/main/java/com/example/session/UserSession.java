package com.example.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 这里注意@Scope注解：
 *  @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)这个是说在每次注入的时候回自动创建一个新的bean实例
 *  @Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)单例模式，在整个应用中只能创建一个实例
 *  @Scope(value=WebApplicationContext.SCOPE_GLOBAL_SESSION)全局session中的一般不常用
 *  @Scope(value=WebApplicationContext.SCOPE_APPLICATION)在一个web应用中只创建一个实例
 *  @Scope(value=WebApplicationContext.SCOPE_REQUEST)在一个请求中创建一个实例
 *  @Scope(value=WebApplicationContext.SCOPE_SESSION)每次创建一个会话中创建一个实例里面还有个属性
 *  proxyMode=ScopedProxyMode.INTERFACES创建一个JDK代理模式
 *  proxyMode=ScopedProxyMode.TARGET_CLASS基于类的代理模式
 *  proxyMode=ScopedProxyMode.NO（默认）不进行代理 
 */
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class UserSession implements Serializable {

	private static final long serialVersionUID = 9120765714832970813L;

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
