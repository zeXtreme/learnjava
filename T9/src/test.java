public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();
		stu.setSno(130901);
		stu.setName("张三");
		stu.setAge(20);

		stu.showInfo();

		Person per = new Person();
		per.setName("张三");
		per.setAge(20);

		per.display();

		Number num = new Number();
		num.setN1(20);
		num.setN2(10);

		System.out.println("和：" + num.addition() + "\n差：" + num.subtration()
				+ "\n积：" + num.multiplication() + "\n商：" + num.division());

		MyTime mt = new MyTime();
		mt.setHour(8);
		mt.setMinute(20);
		mt.setSecond(10);

		mt.display();

		Addition add = new Addition();

		System.out.println(add.add(3.4, 5.6));

	}

}
