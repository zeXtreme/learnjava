package me.zwy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();

		ArrayList list = new ArrayList();
		list.add("�� ��");
		list.add("�� ��");
		list.add("�� ��");
		list.add("�� ��");
		list.add("�� ����");
		list.add("�� �޼�");

		Iterator iterList = list.iterator();
		while (iterList.hasNext()) {
			String str = (String) iterList.next();
			String[] strArr = str.split(" ");
			if (map.containsKey(strArr[0])) {
				int count = (int) map.get(strArr[0]);
				count++;
				map.put(strArr[0], count);
			} else {
				map.put(strArr[0], 1);
			}
		}

		Iterator iterMap = map.entrySet().iterator();
		while (iterMap.hasNext()) {
			Entry entryMap = (Entry) iterMap.next();
			System.out.println("��" + entryMap.getKey() + "����"
					+ entryMap.getValue() + "��");
		}

	}

}
