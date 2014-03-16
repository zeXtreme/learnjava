package me.zwy.work;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 制作一个联系人管理系统，包含联系人的添加、查询、修改和显示。
 * 程序运行后先添加数据，关闭后要保存添加的数据，在下次运行的时候能显示出来，
 * 显示菜单如下：
 * 1.显示所有数据
 * 2.添加新联系人
 * 3.查找联系人（根据名字）
 * 4.删除联系人
 * 5.修改联系人
 * 6.退出
 * @author Zeng
 *
 */
public class Demo {

	static ArrayList contacts = new ArrayList();
	static Scanner scan = new Scanner(System.in);
	static final File FILE_NAME = new File("Contacts.dat");
	
	public static void main(String[] args) throws Exception {
		try{
			if(FILE_NAME.exists()){
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
				contacts = (ArrayList)ois.readObject();
				ois.close();
			}
		}catch (EOFException io){	
		}finally{
			System.out.println("=================联系人管理系统==================");
			while(true){
				System.out.println("1.显示所有联系人 2.添加新联系人 3.查找联系人 4.删除联系人 5.修改联系人 6.退出系统");
				System.out.print("请输入你想要进行的操作（1-6）：");
				int choose = scan.nextInt();
				if(choose == 1){
					showALL();
				}else if(choose == 2){
					creatContact();
				}else if(choose == 3){
					findByName();
				}else if(choose == 4){
					deleteContact();
				}else if(choose == 5){
					changeContact();
				}else if(choose == 6){
					exit();
					scan.close();
					break;
				}else{
					System.out.println("输入错误，请输入1-6的选项！");
				}
			}
		}
	}
	
	/**
	 * 显示所有数据
	 */
	public static void showALL(){
		System.out.println("姓名"+"\t"+"年龄"+"\t"+"电话");
		if(contacts.size() == 0){
			System.out.println("没有联系人！请添加！");
		}else{
			for(int i=0;i<contacts.size();i++){
				Contact c = (Contact)contacts.get(i);
				System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getTel());
			}
		}
		
	}
	
	/**
	 * 添加新联系人
	 * @throws Exception 
	 */
	public static void creatContact() throws Exception{
		Contact c = new Contact();
		System.out.print("请输入联系人姓名：");
		c.setName(scan.next());
		System.out.print("请输入联系人年龄：");
		c.setAge(scan.nextInt());
		System.out.print("请输入联系人电话：");
		c.setTel(scan.next());
		contacts.add(c);
		System.out.println("添加成功！");
		saveData();
	}
	
	/**
	 * 查找联系人（根据名字）
	 * @throws Exception 
	 */
	public static void findByName(){
		System.out.print("请输入你想要查找的联系人的名字：");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("没有这个联系人");
		}else{
			System.out.println("姓名"+"\t"+"年龄"+"\t"+"电话");
			System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getTel());
		}
	}
	
	/**
	 * 删除联系人
	 * @throws Exception 
	 */
	public static void deleteContact() throws Exception{
		System.out.print("请输入要删除的联系人的名字：");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("没有这个联系人");
		}else{
			contacts.remove(c);
			System.out.println("删除成功！");
		}
		saveData();
	}
	
	/**
	 * 修改联系人
	 * @throws Exception 
	 */
	public static void changeContact() throws Exception{
		System.out.print("请输入要修改的联系人的名字：");
		String cname = scan.next();
		Contact c = null;
		for(int i=0;i<contacts.size();i++){
			c = (Contact)contacts.get(i);
			if(c.getName().equals(cname)){
				break;
			}else{
				c = null;
			}
		}
		if(c == null){
			System.out.println("没有这个联系人");
		}else{
			System.out.print("请输入新的姓名：");
			c.setName(scan.next());
			System.out.print("请输入新的年龄：");
			c.setAge(scan.nextInt());
			System.out.print("请输入新的电话：");
			c.setTel(scan.next());
			System.out.println("修改成功！");
		}
		saveData();
	}
	
	/**
	 * 退出
	 * @throws Exception
	 */
	public static void exit() throws Exception{
		saveData();
		System.out.println("谢谢您的使用");
	}
	
	/**
	 * 保存数据
	 * @throws Exception
	 */
	public static void saveData() throws Exception{
		//按名字排序
		Collections.sort(contacts);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
		oos.writeObject(contacts);
		oos.flush();
		oos.close();
	}

}
