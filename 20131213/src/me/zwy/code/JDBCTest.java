package me.zwy.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) throws Exception{
		//注册驱动
		Class.forName("oracle.jdbc.OracleDriver");
		//建立连接
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:zeng", "scott", "tiger");
		//创建命令对象
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//执行命令
		//增删改用executeUpdate返回影响的行数
//		int n = st.executeUpdate("insert into dept2 values(5,'zeng','cs',10)");
//		if(n > 0){
//			System.out.println("数据添加成功");
//		}else{
//			System.out.println("数据添加失败");
//		}
		//查询用executeQuery返回结果集
		ResultSet rs = st.executeQuery("select * from dept2");
		while(rs.next()){
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			int max = rs.getInt(4);
			System.out.println(deptno + " " + dname + " " + loc + " " + max);
		}
		if(rs.first()){
			System.out.println("已经移到第一条数据");
		}else{
			System.out.println("表中已经没有数据");
		}
	}

}
