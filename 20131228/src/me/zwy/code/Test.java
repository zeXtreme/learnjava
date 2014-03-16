package me.zwy.code;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		String sql = createTable(Employee.class);
		System.out.println(sql);
	}
	
	public static String createTable(Class c){
		String sql = "CREATE TABLE ";
		Annotation[] annos = c.getAnnotations();
		for(Annotation an : annos){
			if(an instanceof Table){
				Table t = (Table) an;
				sql += t.value() + "(";
			}
		}
		Field[] fs = c.getDeclaredFields();
		for(Field f : fs){
			annos = f.getAnnotations();
			for(Annotation an : annos){
				if(an instanceof Cloumn){
					Cloumn cl = (Cloumn) an;
					sql += cl.name() + " " + cl.type() + "(" + cl.length() + ")" + ",";
				}
			}
		}
		sql = sql.substring(0, sql.length()-1) + ")";
		return sql;
	}

}
