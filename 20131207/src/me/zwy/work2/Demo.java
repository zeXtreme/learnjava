package me.zwy.work2;

import java.util.*;
import java.util.Map.Entry;

public class Demo {

	/**
	 * дһ������, ���ַ������ϰ��ճ��Ƚ��зּ�
	 * a) ����:  Set<String> 
	 * b)���:  Map<Integer, List<String>>, key �������ַ����еĸ��ֳ���, value ��ͬһ�����ȵ������ַ�����List. 
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
			System.out.println("����Ϊ��" + e.getKey() + "���ַ����У�" + e.getValue());
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
