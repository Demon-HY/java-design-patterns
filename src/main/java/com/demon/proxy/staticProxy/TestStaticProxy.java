package com.demon.proxy.staticProxy;

/**
 * 静态代理测试类
 * Created by Demon-HY on 2018/3/26 0026.
 */
public class TestStaticProxy {

	public static void main(String[] args) {
		// 被代理类
		User user = new User();
		// 代理类
		UserProxy userProxy = new UserProxy(user);
		userProxy.deleteUser(1L);
	}
}
