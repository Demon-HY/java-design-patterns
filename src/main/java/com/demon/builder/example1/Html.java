package com.demon.builder.example1;

import java.util.Arrays;

/**
 * Created by Demon-HY on 2018/1/16 0016.
 */
public class Html {

	private String[] divide(double num){
		long zheng = (long)num;
		long xiao = Math.round((num-zheng)*100);
		return new String[] {zheng+"",String.valueOf(xiao) };
	}

	public static void main(String[] args){
		Html nr = new Html();
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
	}
}
