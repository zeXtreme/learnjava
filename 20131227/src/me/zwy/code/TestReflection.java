package me.zwy.code;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws Exception{
		//����
		String msg = "hello world";
		Class c = msg.getClass();
		c = String.class;
		c = Class.forName("java.lang.String");
//		c = Integer.TYPE;//ֻ�԰�װ��
		c = Employee.class;
		Constructor constr = c.getConstructor();
		System.out.println("�޲ι��췽��");
		System.out.println(constr.toGenericString());
		constr = c.getConstructor(int.class);
		System.out.println("��int�������췽��");
		System.out.println(constr.toGenericString());
		System.out.println("�������췽��");
		Constructor[] cs = c.getConstructors();
		for(Constructor t : cs){
			System.out.println(t.toGenericString());
		}
		System.out.println("���й��췽��");
		cs = c.getDeclaredConstructors();
		for(Constructor t : cs){
			System.out.println(t.toGenericString());
		}
		//���ù��캯�����ɶ���
		Object o = constr.newInstance(20);
		System.out.println(o);
		Constructor pri_c = c.getDeclaredConstructor(String.class);
		System.out.println("˽�й��캯��");
		System.out.println(pri_c.toGenericString());
		pri_c.setAccessible(true);//���÷���Ȩ��
		o = pri_c.newInstance("zs");
		System.out.println(o);
		//����
		Method method = c.getDeclaredMethod("printMsg", null);
		method.setAccessible(true);  
		method.invoke(null, null);
		//����
		Field field = c.getDeclaredField("name");
		field.setAccessible(true);
		System.out.println(field.get(o));
	}

}
