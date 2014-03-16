package me.zwy.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

import me.zwy.util.DBConnection;

public class JDBCTest {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
//		PreparedStatement pst = conn.prepareStatement("select * from tuser where uname=? and upwd=?");
//		System.out.print("�������û�����");
//		String user = scan.next();
//		pst.setString(1, user);
//		System.out.print("���������룺");
//		String pwd = scan.next();
//		pst.setString(2, pwd);
//		ResultSet rs = pst.executeQuery();
//		if(rs.next()){
//			System.out.println("��¼�ɹ�");
//		}else{
//			System.out.println("��¼ʧ�ܣ��û������������");
//		}
//		scan.close();
		PreparedStatement pst = conn.prepareStatement("select * from emp2 where sal>=?");
		System.out.print("��������Ҫ��ѯ�Ĺ���(���ڻ���ڴ˹��ʵ�Ա���������)��");
		int sal = scan.nextInt();
		pst.setInt(1, sal);
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsd = rs.getMetaData();
		for(int i = 1;i <= rsd.getColumnCount();i++){
			System.out.print(rsd.getColumnName(i) + "\t");
		}
		System.out.println();
		while(rs.next()){
//			System.out.println(rs.getString("empno") + " " + rs.getString("ename") + " " + rs.getString("sal"));
			for(int i = 1;i <= rsd.getColumnCount();i++){
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
