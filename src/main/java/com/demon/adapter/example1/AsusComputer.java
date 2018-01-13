package com.demon.adapter.example1;

/**
 * 华硕电脑要使用开机和关机方法，他需要实现接口 IComputer，这里是不需要 主板型号，CPU型号，电脑品牌这三个方法的，但是实现接口类必须要
 * 实现所有的接口,这样代码会很臃肿，造成误解也会给其他使用者，不提倡这种写法
 *
 * Created by Demon-Coffee on 2017/12/1 0001.
 */
public class AsusComputer implements IComputer {

	@Override
	public String getComputerBrand() {
		return null;
	}

	@Override
	public String getBoardModel() {
		return null;
	}

	@Override
	public String getCPUModel() {
		return null;
	}

	public void startBoot() {
		System.out.println("startBoot");
	}

	public void shutdown() {
		System.out.println("shutdown");
	}

	public static void main(String[] args) {
		AsusComputer a = new AsusComputer();
		a.startBoot();
	}
}
