package me.zwy.work2;

import java.util.*;
import java.util.Map.Entry;

public class Demo {

	/**
	 * 写一个函数, 把字符串集合按照长度进行分拣
	 * a) 输入:  Set<String> 
	 * b)输出:  Map<Integer, List<String>>, key 是输入字符串中的各种长度, value 是同一个长度的所有字符串的List. 
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("abc");
		hs.add("fasd");
		hs.add("a32ads");
		hs.add("a23");
		hs.add("abw4");
		hs.add("523");
		hs.add("22");
		
		HashMap hm = (HashMap) leng(hs);
		Set entrySet = hm.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Entry e = (Entry) it.next();
			System.out.println("长度为：" + e.getKey() + "的字符串有：" + e.getValue());
		}
	}
	
	public static Map leng(Set string){
		HashMap hm = new HashMap();
		Iterator it = string.iterator();
		while(it.hasNext()){
			String str = it.next().toString();
			List al = null;
			if(hm.containsKey(str.length())){
				al = (ArrayList) hm.get(str.length());
			}else{
				al = new ArrayList();
			}
			al.add(str);
			hm.put(str.length(), al);
		}
		return hm;
	}

}
