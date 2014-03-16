package me.zwy.code;

public class ObjectFactory {
	
	public static Object getObject(Class className){
		try {
			return className.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object getObject(Class className,String[] params,Object... param){
		return null;
	}
	
	public static void main(String[] args) {
		Object o = ObjectFactory.getObject(Employee.class);
		System.out.println(o.getClass());
	}

}
