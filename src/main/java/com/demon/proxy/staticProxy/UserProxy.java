package com.demon.proxy.staticProxy;

import java.util.Map;

/**
 * 用户代理类
 * Created by Demon-HY on 2018/3/26 0026.
 */
public class UserProxy implements IUser {

	private IUser target;

	public UserProxy(IUser user) {
		this.target = user;
	}

	@Override
	public Map<String, Object> deleteUser(Long userId) {
		System.out.println("删除用户前");
		target.deleteUser(userId);
		System.out.println("删除用户后");
		return null;
	}
}
