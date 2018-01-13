package com.demon.adapter.example1;

/**
 * 电脑适配器类，这里实现 电脑类所有的方法，之后当有一个类需要继承 IComputer 的时候直接继承该类就可以了，这样实现类中
 *
 * Created by Demon-Coffee on 2017/12/1 0001.
 */
public abstract class IComputerAdapter implements IComputer {

	public String getComputerBrand() {
		return null;
	}

	public String getBoardModel() {
		return null;
	}

	public String getCPUModel() {
		return null;
	}

	public void startBoot() {

	}

	public void shutdown() {

	}
}
