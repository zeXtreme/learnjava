/**
 * ��дJava����������ʾ�˵����������䡣 ����һ�����ࣨPerson����������Ӧ��������˽�����ԣ�������name���� ���䣨age�������幹��
 * ������������ʼ�����ݳ�Ա���ٶ�����ʾ��display���������������������ӡ������ ��main�����д��������ʵ����Ȼ����Ϣ��ʾ��
 */
public class Person {

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {

	}

	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("������" + name + "\n���䣺" + age);
	}

}
