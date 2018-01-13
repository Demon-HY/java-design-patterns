package com.demon.factoryMethod.example2;

/**
 * 狗的工厂类
 *
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class DogFactoryMethod implements IAnimalFactoryMethod {

	@Override
	public IAnimal getInstance(String animalType) throws Exception {
		if(animalType.toLowerCase().equals("dog")) {
			return new Dog();
		}

		throw new Exception("你要查找的动物没有入库");
	}
}
