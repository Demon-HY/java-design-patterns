package com.demon.factoryMethod.example2;

/**
 * 猫的工厂类
 *
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class CatFactoryMethod implements IAnimalFactoryMethod {

	@Override
	public IAnimal getInstance(String animalType) throws Exception {
		if(animalType.toLowerCase().equals("cat")) {
			return new Cat();
		}
		
		throw new Exception("你要查找的动物没有入库");
	}
}
