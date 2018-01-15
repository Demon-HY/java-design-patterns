package com.demon.abstractFactory.example1;

/**
 * 这里是一个简单的
 *
 * Created by Demon-Coffee on 2018/1/15 0015.
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		IAbstractFactory factory = new ProductAbstractFactory();
		factory.createProduct1().show();
		factory.createProduct2().show();
	}
}
