package me.zwy.code;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintClass {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("me.zwy.code.Employee");
		pClass(c);
	}
	public static void pClass(Class c){
		Field[] f = c.getDeclaredFields();
		System.out.println("属性");
		for(Field field : f){
			System.out.println(field.toGenericString());
		}
		Constructor[] cons = c.getDeclaredConstructors();
		System.out.println("构造方法");
		for(Constructor con : cons){
			System.out.println(con.toGenericString());
		}
		Method[] ms = c.getDeclaredMethods();
		System.out.println("方法");
		for(Method m : ms){
			System.out.println(m.toGenericString());
		}
	}

}
