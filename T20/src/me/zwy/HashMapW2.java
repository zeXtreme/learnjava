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
		list.add("张 三");
		list.add("李 四");
		list.add("王 五");
		list.add("赵 六");
		list.add("张 三丰");
		list.add("张 无忌");

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
			System.out.println("姓" + entryMap.getKey() + "的有"
					+ entryMap.getValue() + "人");
		}

	}

}
