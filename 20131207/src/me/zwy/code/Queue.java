package me.zwy.code;

import java.util.LinkedList;

public class Queue {

	private LinkedList queue = new LinkedList();
	
	public void in(Object o){
		if(queue.size()<5){
			queue.addLast(o);
			System.out.println(o + "�����");
		}else{
			System.out.println("��������");
		}
	}
	
	public Object out(){
		if(queue.size()>0){
			Object o = queue.removeFirst();
			System.out.println(o + "������");
			return o;
		}else{
			System.out.println("�����ѿ�");
			return null;
		}
	}
}
