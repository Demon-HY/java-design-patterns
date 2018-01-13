package com.demon.factoryMethod.example1;

/**
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class Cat implements IAnimal {

	/**
	 * 猫的特长
	 */
	public String getSpecialty(String specialty) {
		return "我会" + specialty;
	}

	public String getInfo() {
		return "我是一只可爱的小猫咪";
	}
}
