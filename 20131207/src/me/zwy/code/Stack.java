package me.zwy.code;

import java.util.LinkedList;

public class Stack {
	
	private LinkedList stack = new LinkedList();
	
	public void push(Object o){
		stack.addLast(o);
		System.out.println(o + "��ջ��");
	}
	
	public Object pop(){
		if(stack.size()>0){
			Object o = stack.removeLast();
			System.out.println(o + "��ջ��");
			return o;
		}else{
			System.out.println("ջ��û������");
			return null;
		}
	}

}
