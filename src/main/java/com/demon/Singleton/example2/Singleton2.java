package com.demon.Singleton.example2;

/**
 * 饿汉式加载
 *
 * 之前的例子里面采用的是懒汉式加载，对象的创建是在程序启动中完成，这种的缺点是资源的浪费，合理的方式应该是在使用的时候去创建，
 * 下面的加载是由外部决定的
 * 
 * Created by Demon-Coffee on 2018/1/15 0015.
 */
public  class Singleton2 {

	// 构造一个私有的构造器  
	private Singleton2 (){ }

	private static Singleton2 single;

	// 这里是由外部决定什么时候创建实例  
	public static void init() {
		single= new Singleton2 ();
	}

	// 获取对象实例  
	public static Singleton2 getInstance()throws Exception{
		if(single!= null) {
			return single;
		}
		else{
			throw new Exception("类还未创建实例");
		}
	}
}
