/**
 * 创建一个学生类，包括有学号，姓名，年龄。并且有 方法显示学生信息。在类中定义带参数的构造方法，实 现对学生对象的初始化。编写测试类，完成学生对象的
 * 创建和信息输出。
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
		System.out.println("学号：" + sno + "\n姓名：" + name + "\n年龄：" + age);
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
