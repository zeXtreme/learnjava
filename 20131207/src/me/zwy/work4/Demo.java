package me.zwy.work4;

import java.util.*;

public class Demo {

	/**
	 * ��һ��List���ϣ�����Ԫ��ΪSet����
	 * ÿһ��Set������Ԫ��ΪCharacter
	 * Ҫ�����һ���㷨�õ�Set��������Ԫ�ؿ�����ϡ�
	 * ���磺List����3��set����
	 * ��һ��set����Ԫ��Ϊ11��12��13
	 * �ڶ���set����Ԫ��Ϊ99��AA,B,DD
	 * ������set����Ԫ��Ϊ7��8��34
	 * ��ô�������Ϊ
	 * 11997��11998��119934,11AA7,11AA8,11AA34����
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
		System.out.println("һ���У�" + l.size());
	}
	
	public static List all(List list){
		List l = null;
		List li = null;
		for(int i=0;i<list.size();i++){
//			System.out.println(i + "��ѭ��");
			if(l == null){
				l = new ArrayList();
				Set s = (Set) list.get(i);
				Iterator it = s.iterator();
				while(it.hasNext()){
					l.add(it.next());
				}
//				System.out.println("��һ��Setд�뼯��");
			}else{
				li = new ArrayList();
				Set s = (Set)list.get(i);
//				System.out.println("l�ĳ���:" + l.size());
				for(int j=0;j<l.size();j++){
					Iterator it = s.iterator();
//					System.out.println(j + "ѭ����ʼ");
//					System.out.println(l.get(j));
					while(it.hasNext()){
//						System.out.println("��ѭ����ʼ");
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
