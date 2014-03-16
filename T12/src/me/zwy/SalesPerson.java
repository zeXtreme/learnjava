package me.zwy;

/**
 * ��Employee��������SalesPerson�ಢ��SalesPerson������˽�е�territory��
 * ����ΪString����SalesPerson�и���Employee���toString����������
 * ���ذ���name��salary��territory��Ϣ���ַ�����
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
