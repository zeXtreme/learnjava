package me.zwy.work3;

import java.util.*;

public class Demo {

	/**
	 * Ҫ�󽫶����������ϲ���һ�����飬
	 * Ҫ��õ������ս�������������У�
	 * ͬʱ�޳����������е��ظ����ݡ� 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a1 = {12,15,18,20,25};
		int[] a2 = {11,18,20,22,25};
		int[] a3 = {19,21,23,27,40};
		
		ArrayList al = new ArrayList();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		
		TreeSet ts = new TreeSet();
		for(int i=0;i<al.size();i++){
			int[] a = (int[]) al.get(i);
			for(int j=0;j<a.length;j++){
				ts.add(a[j]);
			}
		}
		
		Iterator it = ts.iterator();
		int[] a = new int[ts.size()];
		for(int i=0;i<a.length;i++){
			a[i] = (int) it.next();
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
	}

}
