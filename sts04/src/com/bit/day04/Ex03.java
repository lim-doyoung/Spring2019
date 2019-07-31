package com.bit.day04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.module.Module4;

public class Ex03 {

	public static void main(String[] args) {
		ApplicationContext context = null;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Module4 mod=(Module4) context.getBean("mod4");
		System.out.println(mod.getMsg());
		System.out.println(mod.getNum1());
		System.out.println(mod.getNum2());
		System.out.println(mod.getCh());
		System.out.println(mod.isBoo());
	}
}
