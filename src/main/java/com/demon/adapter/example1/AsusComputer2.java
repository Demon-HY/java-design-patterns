package com.demon.adapter.example1;

/**
 * 华硕电脑 继承电脑适配器类，这样华硕电脑就可以实现任何他想实现的方法，而不去关心其他方法
 *
 * Created by Demon-Coffee on 2017/12/1 0001.
 */
public class AsusComputer2 extends IComputerAdapter {

	@Override
	public void startBoot() {
		System.out.println("start");
	}

	@Override
	public void shutdown() {
		System.out.println("shutdown");
	}

	public static void main(String[] args) {
		AsusComputer2 asusComputer2 = new AsusComputer2();
		asusComputer2.startBoot();
		asusComputer2.shutdown();
	}
}
