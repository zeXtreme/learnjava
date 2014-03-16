package me.zwy.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws Exception{
		//ע������
		Class.forName("oracle.jdbc.OracleDriver");
		//��������
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:zeng", "scott", "tiger");
		//�����������
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//ִ������
		//��ɾ����executeUpdate����Ӱ�������
//		int n = st.executeUpdate("insert into dept2 values(5,'zeng','cs',10)");
//		if(n > 0){
//			System.out.println("������ӳɹ�");
//		}else{
//			System.out.println("�������ʧ��");
//		}
		//��ѯ��executeQuery���ؽ����
		ResultSet rs = st.executeQuery("select * from dept2");
		while(rs.next()){
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			int max = rs.getInt(4);
			System.out.println(deptno + " " + dname + " " + loc + " " + max);
		}
		if(rs.first()){
			System.out.println("�Ѿ��Ƶ���һ������");
		}else{
			System.out.println("�����Ѿ�û������");
		}
	}

}
