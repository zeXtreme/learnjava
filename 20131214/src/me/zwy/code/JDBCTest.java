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
//		System.out.print("请输入用户名：");
//		String user = scan.next();
//		pst.setString(1, user);
//		System.out.print("请输入密码：");
//		String pwd = scan.next();
//		pst.setString(2, pwd);
//		ResultSet rs = pst.executeQuery();
//		if(rs.next()){
//			System.out.println("登录成功");
//		}else{
//			System.out.println("登录失败，用户名或密码错误");
//		}
//		scan.close();
		PreparedStatement pst = conn.prepareStatement("select * from emp2 where sal>=?");
		System.out.print("请输入你要查询的工资(大于或等于此工资的员工都会输出)：");
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
