package me.zwy.ContactManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * SQL版，请先在数据库中添加表contact(name varchar2(8) unique,age int,tel varchar2(12))
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
public class Manager {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:zeng", "scott", "tiger");
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			System.out.println("=================联系人管理系统==================");
			while(true){
				System.out.println("1.显示所有联系人 2.添加新联系人 3.查找联系人 4.删除联系人 5.修改联系人 6.退出系统");
				System.out.print("请输入你的选择：");
				int choose = scan.nextInt();
				if(choose == 1){
					findAll(st);
				}else if(choose == 2){
					createContact(st);
				}else if(choose == 3){
					findByName(st);
				}else if(choose == 4){
					deleteContact(st);
				}else if(choose == 5){
					changeContact(st);
				}else if(choose == 6){
					System.out.println("感谢您的使用！");
					conn.close();
					break;
				}else{
					System.out.println("没有此选项，请重新输入！");
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}
	
	public static void printContact(ResultSet rs){
		try {
			System.out.println(rs.getString("name") + "\t" + rs.getString("age") + "\t" + rs.getString("tel"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void findAll(Statement st){
		try {
			ResultSet rs = st.executeQuery("select * from contact");
			if(rs.next()){
				System.out.println("姓名\t" + "年龄\t" + "电话");
				printContact(rs);
				while(rs.next()){
					printContact(rs);
				}
			}else{
				System.out.println("没有联系人，请添加新联系人");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void createContact(Statement st){
		try {
			System.out.print("请输入联系人姓名：");
			String name = scan.next();
			System.out.print("请输入联系人年龄：");
			int age = scan.nextInt();
			System.out.print("请输入联系人电话：");
			String tel = scan.next();
			int n = st.executeUpdate("insert into contact values('" + name +"'," + age + ",'" + tel + "')");
			if(n > 0){
				System.out.println("联系人添加成功！");
			}else{
				System.out.println("联系人添加失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void findByName(Statement st){
		try {
			System.out.print("请输入要查找的联系人姓名：");
			String name = scan.next();
			ResultSet rs = st.executeQuery("select * from contact where name='" + name +"'");
			if(rs.next()){
				System.out.println("姓名\t" + "年龄\t" + "电话");
				printContact(rs);
			} else {
				System.out.println("没有此联系人！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteContact(Statement st){
		try {
			System.out.print("请输入要删除的联系人姓名：");
			String name = scan.next();
			int n = st.executeUpdate("delete contact where name='" + name + "'");
			if(n > 0){
				System.out.println("删除成功！");
			} else {
				System.out.println("删除失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void changeContact(Statement st){
		try {
			System.out.print("请输入你要修改的联系人的名字：");
			String name = scan.next();
			ResultSet rs = st.executeQuery("select age,tel from contact where name='" + name + "'");
			if(rs.next()){
				System.out.print("请输入新的年龄：");
				int age = scan.nextInt();
				rs.updateInt("age", age);
				System.out.print("请输入新的电话：");
				String tel = scan.next();
				rs.updateString("tel", tel);
				rs.updateRow();
				System.out.println("修改成功！");
			} else {
				System.out.println("没有此联系人！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
