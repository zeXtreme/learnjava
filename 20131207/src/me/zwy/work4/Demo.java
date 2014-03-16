package me.zwy.work4;

import java.util.*;

public class Demo {

	/**
	 * 有一个List集合，集合元素为Set对象，
	 * 每一个Set对象含有元素为Character
	 * 要求设计一个算法得到Set对象所有元素可能组合。
	 * 例如：List中有3个set对象，
	 * 第一个set对象元素为11，12，13
	 * 第二个set对象元素为99，AA,B,DD
	 * 第三个set对象元素为7，8，34
	 * 那么可能组合为
	 * 11997，11998，119934,11AA7,11AA8,11AA34……
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		Set s = new HashSet();
		s.add(11);
		s.add(12);
		s.add(13);
		list.add(s);
		s = new HashSet();
		s.add(99);
		s.add("AA");
		s.add("B");
		s.add("DD");
		list.add(s);
		s = new HashSet();
		s.add(7);
		s.add(8);
		s.add(34);
		list.add(s);
		s = new HashSet();
		s.add("zz");
		s.add("cd");
		list.add(s);
		s = new HashSet();
		s.add("ac");
		s.add("bilibili");
		list.add(s);
		
		List l= all(list);
		System.out.println(l);
		System.out.println("一共有：" + l.size());
	}
	
	public static List all(List list){
		List l = null;
		List li = null;
		for(int i=0;i<list.size();i++){
//			System.out.println(i + "大循环");
			if(l == null){
				l = new ArrayList();
				Set s = (Set) list.get(i);
				Iterator it = s.iterator();
				while(it.hasNext()){
					l.add(it.next());
				}
//				System.out.println("第一个Set写入集合");
			}else{
				li = new ArrayList();
				Set s = (Set)list.get(i);
//				System.out.println("l的长度:" + l.size());
				for(int j=0;j<l.size();j++){
					Iterator it = s.iterator();
//					System.out.println(j + "循环开始");
//					System.out.println(l.get(j));
					while(it.hasNext()){
//						System.out.println("内循环开始");
						String str = l.get(j).toString() + it.next().toString();
//						System.out.println(str);
						li.add(str);
					}
				}
//				System.out.println(li);
				l = new ArrayList();
				for(int j=0;j<li.size();j++){
					l.add(li.get(j));
				}
//				System.out.println(l);
			}
		}
		return li;
	}
	
}
