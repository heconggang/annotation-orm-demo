package com.hecg.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：自定义注解测试
 *
 * @author hecg
 * @version 2019年11月13日
 */
@Target(value = { ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	String name() default "crp";

	int age() default 0;

	String[]arrs();
}

/**
 * 功能：测试自定义注解
 *
 * @author hecg
 * @version 2020年11月10日 下午10:15:35
 */
public class AnnotationTest {
	@MyAnnotation(name = "hecg", age = 27, arrs = { "1", "2" })
	public static void add1() {
		System.out.println("add1...........");
	}

	@MyAnnotation(arrs = { "1", "2" })
	public static void add2() {
		System.out.println("add2...........");
	}

	public static void main(String[] args) {
		add1();
		add2();
	}
}
