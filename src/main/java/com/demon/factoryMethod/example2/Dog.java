package com.demon.factoryMethod.example2;

/**
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class Dog implements IAnimal {

	/**
	 * 狗的特长
	 */
	public String getSpecialty(String specialty) {
		return "我会" + specialty;
	}

	public String getInfo() {
		return "我是一条单身狗";
	}
}
