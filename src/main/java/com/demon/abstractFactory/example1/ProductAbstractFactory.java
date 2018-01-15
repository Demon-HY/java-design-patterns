package com.demon.abstractFactory.example1;

/**
 * Created by Demon-Coffee on 2018/1/15 0015.
 */
public class ProductAbstractFactory implements IAbstractFactory {

	@Override
	public IProduct1 createProduct1() {
		return new Product1();
	}

	@Override
	public IProduct2 createProduct2() {
		return new Product2();
	}
}
