public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();
		stu.setSno("130901");
		stu.setName("����");
		stu.setAge(20);

		stu.showInfo();

	}

}

class Student {
	private String sno;
	private String name;
	private int age;

	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 18 && age < 30) {
			this.age = age;
		} else {
			this.age = 20;
		}
	}

	public void showInfo() {
		System.out.print("ѧ�ţ�" + sno + "\n������" + name + "\n���䣺" + age);
	}

}