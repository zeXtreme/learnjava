package me.zwy.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:zeng", "scott", "tiger");
		Statement st = conn.createStatement();
		System.out.print("�������û�����");
		String user = scan.next();
		System.out.print("���������룺");
		String pwd = scan.next();
		String sql = "select * from tuser where uname='" + user + "' and upwd='" + pwd + "'";
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		scan.close();
	}

}
