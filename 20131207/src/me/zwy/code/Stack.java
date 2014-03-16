package me.zwy.code;

import java.util.LinkedList;

public class Stack {
	
	private LinkedList stack = new LinkedList();
	
	public void push(Object o){
		stack.addLast(o);
		System.out.println(o + "入栈了");
	}
	
	public Object pop(){
		if(stack.size()>0){
			Object o = stack.removeLast();
			System.out.println(o + "出栈了");
			return o;
		}else{
			System.out.println("栈中没有数据");
			return null;
		}
	}

}
