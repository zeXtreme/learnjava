package me.zwy.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashmap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, 123);
		hm.put(2, "wtf");
		
		Set keys = hm.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key + " " + hm.get(key));
		}
		
		Set entrySet = hm.entrySet();
		it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry kv = (Entry) it.next();
			System.out.println(kv.getKey() + " " + kv.getValue());
		}
	}

}
