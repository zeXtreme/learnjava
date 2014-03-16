package me.zwy.code;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws Exception{
		//反射
		String msg = "hello world";
		Class c = msg.getClass();
		c = String.class;
		c = Class.forName("java.lang.String");
//		c = Integer.TYPE;//只对包装类
		c = Employee.class;
		Constructor constr = c.getConstructor();
		System.out.println("无参构造方法");
		System.out.println(constr.toGenericString());
		constr = c.getConstructor(int.class);
		System.out.println("带int参数构造方法");
		System.out.println(constr.toGenericString());
		System.out.println("公共构造方法");
		Constructor[] cs = c.getConstructors();
		for(Constructor t : cs){
			System.out.println(t.toGenericString());
		}
		System.out.println("所有构造方法");
		cs = c.getDeclaredConstructors();
		for(Constructor t : cs){
			System.out.println(t.toGenericString());
		}
		//利用构造函数生成对象
		Object o = constr.newInstance(20);
		System.out.println(o);
		Constructor pri_c = c.getDeclaredConstructor(String.class);
		System.out.println("私有构造函数");
		System.out.println(pri_c.toGenericString());
		pri_c.setAccessible(true);//设置访问权限
		o = pri_c.newInstance("zs");
		System.out.println(o);
		//方法
		Method method = c.getDeclaredMethod("printMsg", null);
		method.setAccessible(true);  
		method.invoke(null, null);
		//属性
		Field field = c.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println(field.get(o));
	}

}
