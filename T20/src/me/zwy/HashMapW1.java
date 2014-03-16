package me.zwy;

import java.util.*;
import java.util.Map.Entry;

public class HashMapW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();

		String msg = "abcabcabc";

		char[] charArr = msg.toCharArray();

		for (char c : charArr) {
			if (map.containsKey(c)) {
				int count = (int) map.get(c);
				count++;
				map.put(c, count);
			} else {
				map.put(c, 1);
			}
		}

		Iterator entryIt = map.entrySet().iterator();
		while (entryIt.hasNext()) {
			Entry etry = (Entry) entryIt.next();
			System.out.println(etry.getKey() + "--" + etry.getValue());
		}

	}

}
