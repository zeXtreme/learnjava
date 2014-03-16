package me.zwy.work;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;
import me.zwy.util.DBConnection;

public class work1 {

	/**
	 * 建立一个Employee数据库表（eid,ename,etel).
	 * 建立一个增加新员工的存储过程，参数为上述3列，
	 * 同时返回“成功”或“失败”的字符串。
	 * 写一个java程序测试上述存储过程的正确性
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
		CallableStatement cs = conn.prepareCall("{call add_employee(?,?,?,?)}");
		System.out.print("请输入员工编号：");
		int eid = scan.nextInt();
		cs.setInt(1, eid);
		System.out.print("请输入员工名字：");
		String ename = scan.next();
		cs.setString(2, ename);
		System.out.print("请输入员工电话：");
		String etel = scan.next();
		cs.setString(3, etel);
		cs.registerOutParameter(4, OracleTypes.VARCHAR);
		cs.execute();
		String result = cs.getString(4);
		System.out.println(result);
		scan.close();
	}

}
