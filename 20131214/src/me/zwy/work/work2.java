package me.zwy.work;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;
import me.zwy.util.DBConnection;

public class work2 {

	/**
	 * 写一个存储过程实现根据员工编号返回对应信息的功能。并编写java程序测试
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
		CallableStatement cs = conn.prepareCall("call pkg_Employee.find_Employee(?,?)");
		System.out.print("请输入要查找的员工编号：");
		int eid = scan.nextInt();
		cs.setInt(1, eid);
		cs.registerOutParameter(2, OracleTypes.CURSOR);
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		ResultSetMetaData rsd = rs.getMetaData();
		if(rs.next()){
			for(int i = 1;i <= rsd.getColumnCount();i++){
				System.out.print(rs.getString(i) + "  ");
			}
			System.out.println();
		}else{
			System.out.println("没有这个员工！");
		}
		scan.close();
	}

}
