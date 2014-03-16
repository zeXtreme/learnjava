package me.zwy.code;

import java.util.LinkedList;

public class Queue {

	private LinkedList queue = new LinkedList();
	
	public void in(Object o){
		if(queue.size()<5){
			queue.addLast(o);
			System.out.println(o + "入队了");
		}else{
			System.out.println("队伍已满");
		}
	}
	
	public Object out(){
		if(queue.size()>0){
			Object o = queue.removeFirst();
			System.out.println(o + "出队了");
			return o;
		}else{
			System.out.println("队列已空");
			return null;
		}
	}
}
