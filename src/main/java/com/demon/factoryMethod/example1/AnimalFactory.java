package com.demon.factoryMethod.example1;

/**
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class AnimalFactory {

	/**
	 * 获取动物信息实例
	 * @param animalType 动物类型:dog/cat
	 */
	public static IAnimal getInstance(String animalType) throws Exception {
		switch (animalType.toLowerCase()) {
			case "dog":
				return new Dog();
			case "cat":
				return new Cat();
			default:
				throw new RuntimeException("你要查找的动物没有入库");
		}
	}
}
