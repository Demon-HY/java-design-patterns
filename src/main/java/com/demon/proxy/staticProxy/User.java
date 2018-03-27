package com.demon.proxy.staticProxy;

import java.util.Map;

/**
 * 用户接口实现类，也是被代理类
 * Created by Demon-HY on 2018/3/26 0026.
 */
public class User implements IUser {

	@Override
	public Map<String, Object> deleteUser(Long userId) {
		return null;
	}
}
