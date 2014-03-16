package me.zwy.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Student stu = new Student();
		System.out.print("������������");
		stu.setName(scan.next());
		System.out.print("���������䣺");
		stu.setAge(scan.nextInt());
		System.out.print("������绰��");
		stu.setTel(scan.next());
		scan.close();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.dat"));
		oos.writeObject(stu);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.dat"));
		Student s = (Student)ois.readObject();
		ois.close();
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getTel());
	}

}
