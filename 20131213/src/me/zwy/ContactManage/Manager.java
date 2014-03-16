package me.zwy.ContactManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * SQL�棬���������ݿ�����ӱ�contact(name varchar2(8) unique,age int,tel varchar2(12))
 * ����һ����ϵ�˹���ϵͳ��������ϵ�˵���ӡ���ѯ���޸ĺ���ʾ��
 * �������к���������ݣ��رպ�Ҫ������ӵ����ݣ����´����е�ʱ������ʾ������
 * ��ʾ�˵����£�
 * 1.��ʾ��������
 * 2.�������ϵ��
 * 3.������ϵ�ˣ��������֣�
 * 4.ɾ����ϵ��
 * 5.�޸���ϵ��
 * 6.�˳�
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
			
			System.out.println("=================��ϵ�˹���ϵͳ==================");
			while(true){
				System.out.println("1.��ʾ������ϵ�� 2.�������ϵ�� 3.������ϵ�� 4.ɾ����ϵ�� 5.�޸���ϵ�� 6.�˳�ϵͳ");
				System.out.print("���������ѡ��");
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
					System.out.println("��л����ʹ�ã�");
					conn.close();
					break;
				}else{
					System.out.println("û�д�ѡ����������룡");
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
				System.out.println("����\t" + "����\t" + "�绰");
				printContact(rs);
				while(rs.next()){
					printContact(rs);
				}
			}else{
				System.out.println("û����ϵ�ˣ����������ϵ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void createContact(Statement st){
		try {
			System.out.print("��������ϵ��������");
			String name = scan.next();
			System.out.print("��������ϵ�����䣺");
			int age = scan.nextInt();
			System.out.print("��������ϵ�˵绰��");
			String tel = scan.next();
			int n = st.executeUpdate("insert into contact values('" + name +"'," + age + ",'" + tel + "')");
			if(n > 0){
				System.out.println("��ϵ����ӳɹ���");
			}else{
				System.out.println("��ϵ�����ʧ�ܣ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void findByName(Statement st){
		try {
			System.out.print("������Ҫ���ҵ���ϵ��������");
			String name = scan.next();
			ResultSet rs = st.executeQuery("select * from contact where name='" + name +"'");
			if(rs.next()){
				System.out.println("����\t" + "����\t" + "�绰");
				printContact(rs);
			} else {
				System.out.println("û�д���ϵ�ˣ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteContact(Statement st){
		try {
			System.out.print("������Ҫɾ������ϵ��������");
			String name = scan.next();
			int n = st.executeUpdate("delete contact where name='" + name + "'");
			if(n > 0){
				System.out.println("ɾ���ɹ���");
			} else {
				System.out.println("ɾ��ʧ�ܣ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void changeContact(Statement st){
		try {
			System.out.print("��������Ҫ�޸ĵ���ϵ�˵����֣�");
			String name = scan.next();
			ResultSet rs = st.executeQuery("select age,tel from contact where name='" + name + "'");
			if(rs.next()){
				System.out.print("�������µ����䣺");
				int age = scan.nextInt();
				rs.updateInt("age", age);
				System.out.print("�������µĵ绰��");
				String tel = scan.next();
				rs.updateString("tel", tel);
				rs.updateRow();
				System.out.println("�޸ĳɹ���");
			} else {
				System.out.println("û�д���ϵ�ˣ�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
