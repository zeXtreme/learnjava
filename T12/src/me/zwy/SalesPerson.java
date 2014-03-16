package me.zwy;

/**
 * 从Employee类派生出SalesPerson类并在SalesPerson中声明私有的territory域，
 * 类型为String。在SalesPerson中覆盖Employee类的toString（）方法，
 * 返回包含name、salary和territory信息的字符串。
 * @author Zeng
 *
 */

public class SalesPerson extends Employee{
	
	private String territory;
	
	public SalesPerson(String name,double salary,String territory){
		super(name,salary);
		this.territory=territory;
	}
	
	@Override
	public String toString() {
		return super.toString() + territory ;
	}

}
