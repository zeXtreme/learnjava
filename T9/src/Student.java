/**
 * ����һ��ѧ���࣬������ѧ�ţ����������䡣������ ������ʾѧ����Ϣ�������ж���������Ĺ��췽����ʵ �ֶ�ѧ������ĳ�ʼ������д�����࣬���ѧ�������
 * ��������Ϣ�����
 */
public class Student {

	public Student(int sno, String name, int age) {
		this.sno = sno;
		this.name = name;
		this.age = age;
	}

	public Student() {

	}

	private int sno;
	private String name;
	private int age;

	public void showInfo() {
		System.out.println("ѧ�ţ�" + sno + "\n������" + name + "\n���䣺" + age);
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
