package com.zeng.bean;

/**
 * 1����дһ��Student�࣬Ҫ�� ��1���������ԣ��������Ա����䣬�꼶�� ��2�����з��������ҽ��ܣ����������ѧ�����������ԡ�
 * ��3�����������������Ĺ��췽������һ�����췽���У����� �������������������䡣�Ա�Ĭ��Ϊ�У��꼶ΪS1�����������ɲ���
 * �������ڶ������췽���У��������Ե�ֵ���ɲ��������� ��4����д������StudentTest���в��ԣ��ֱ������ַ�ʽ��ɶ�����
 * Student����ĳ�ʼ�����������ֱ�������ǵ����ҽ��ܷ�����������������
 * 
 * @author Zeng
 * 
 */

public class Student {

	private String name, sex, grade;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.sex = "��";
		this.grade = "S1";
	}

	public Student(String name, String sex, String grade, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}

	public void show() {
		System.out.println("������" + name + " �Ա�" + sex + " ���䣺" + age + " �꼶��"
				+ grade);
	}

}
