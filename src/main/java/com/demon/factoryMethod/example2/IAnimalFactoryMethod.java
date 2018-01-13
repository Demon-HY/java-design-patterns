package com.demon.factoryMethod.example2;

/**
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public interface IAnimalFactoryMethod {

	/**
	 * 生产对象
	 * @param animalType 动物类型:dog/cat
	 */
	IAnimal getInstance(String animalType) throws Exception;
}
