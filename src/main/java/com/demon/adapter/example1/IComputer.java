package com.demon.adapter.example1;

/**
 * 电脑，里面包含了电脑的一些属性
 *
 * Created by Demon-Coffee on 2017/12/1 0001.
 */
public interface IComputer {

	String getComputerBrand(); // 电脑品牌

	String getBoardModel(); // 主板型号

	String getCPUModel(); // CPU 型号

	void startBoot(); // 开机

	void shutdown(); // 关机
}
