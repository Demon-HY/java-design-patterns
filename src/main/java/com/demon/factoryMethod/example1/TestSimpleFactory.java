package com.demon.factoryMethod.example1;

/**
 * 这样做的好处是，屏蔽了底层的创建过程，使用者只需要关心实现即可，不需要关心对象是怎么创建的
 * 缺点也很明显，耦合性很高，当出现一个新的动物的时候，需要修改工厂类，违反了 "开闭原则"，
 * 之后将会通过工厂方法模式来解决 "开闭原则" 问题
 *
 * Created by Demon-Coffee on 2018/1/13 0013.
 */
public class TestSimpleFactory {

	public static void main(String[] args) throws Exception {
		// 我想知道狗的信息
		IAnimal animal = AnimalFactory.getInstance("dog");
		System.out.println(String.format("Dog：%s", animal.getInfo()));
		System.out.println(String.format("Dog：%s", animal.getSpecialty("咬人")));

		// 我想知道猫的信息
		animal = AnimalFactory.getInstance("cat");
		System.out.println(String.format("Cat：%s", animal.getInfo()));
		System.out.println(String.format("Cat：%s", animal.getSpecialty("上树")));

		AnimalFactory.getInstance("pig"); // 这里会报错，因为工厂不支持这个动物的创建
	}

	/*
		程序输出：
		我是一条单身狗
		我会咬人
		我是一只可爱的小猫咪
		我会上树
		Exception in thread "main" java.lang.RuntimeException: 你要查找的动物没有入库
		at com.demon.factoryMethod.example1.AnimalFactory.getInstance(AnimalFactory.java:19)
		at com.demon.factoryMethod.example1.TestFactoryMethod.main(TestFactoryMethod.java:19)
	 */
}
