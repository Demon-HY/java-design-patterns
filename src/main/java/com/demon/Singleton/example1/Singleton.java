package com.demon.Singleton.example1;

/**
 * 懒汉式加载
 * 程序启动的时候，直接创建实例，这样就不会因为并发产生线程安全问题
 *
 * Created by Demon-Coffee on 2018/1/15 0015.
 */
public class Singleton {

	// 构造一个私有的构造器
	private Singleton(){ }

	// 可以看到这里是自己对自己进行实例化的
	private static final Singleton singleton = new Singleton();

	// 获取对象实例
	public static Singleton getInstance()throws Exception{
		return singleton;
	}
}
