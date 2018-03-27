package com.demon.proxy.staticProxy;

import java.util.Map;

/**
 * 用户接口
 * Created by Demon-HY on 2018/3/26 0026.
 */
public interface IUser {

	/**
	 * 删除用户
	 * @param userId 用户ID
	 * @return 返回删除的用户信息
	 */
	Map<String, Object> deleteUser(Long userId);
}
