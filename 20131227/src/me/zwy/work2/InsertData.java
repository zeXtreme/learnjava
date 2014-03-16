package me.zwy.work2;

import java.lang.reflect.Field;

public class InsertData {
	
	public static String insertTab(Object tabObject){
		String sql = null;
		try {
			Class c = tabObject.getClass();
			sql = "INSERT INTO " + c.getSimpleName() +" VALUES(";
			Field[] fs = c.getDeclaredFields();
			for(Field f : fs){
				f.setAccessible(true);
				Object o = f.get(tabObject);
				if(f.getType().getName().equals("int")){
					sql += o + ",";
				}else{
					sql += "'" + o + "',";
				}
			}
			sql = sql.substring(0, sql.length()-1) + ")";
		} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
		}
		
		return sql;
	}
	public static String firstLetterUpper(String str){
		char f = str.charAt(0);
		str = new Character(f).toString().toUpperCase() + str.substring(1);
		return str;
	}
	public static void main(String[] args) {
		Table1 t1 = new Table1("str",1);
		String sql = insertTab(t1);
		System.out.println(sql);
		Table2 t2 = new Table2(1, 2, "str");
		sql = insertTab(t2);
		System.out.println(sql);
		Table3 t3 = new Table3("str", "str1", 1, "str2");
		sql = insertTab(t3);
		System.out.println(sql);
	}

}
