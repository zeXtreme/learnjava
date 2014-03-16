package me.zwy.work;

/**
 * ����һ��Employee�࣬ʵ��Ա�������ʸߵ��������һ������Ա��������������
 * @author Zeng
 *
 */
public class Employee implements Comparable {

	private int eid;
	private String name;
	private int sal;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String name, int sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(this.sal>e.getSal()){
			return 1;
		}else if(this.sal<e.getSal()){
			return -1;
		}else{
			if(this.eid>e.getEid()){
				return 1;
			}else if(this.eid<e.getEid()){
				return -1;
			}else{
				return 0;
			}
		}
	}
	public String toString(){
		return name + "  " + eid + "  " + sal;
	}
}
