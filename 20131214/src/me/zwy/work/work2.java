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
	 * дһ���洢����ʵ�ָ���Ա����ŷ��ض�Ӧ��Ϣ�Ĺ��ܡ�����дjava�������
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
		CallableStatement cs = conn.prepareCall("call pkg_Employee.find_Employee(?,?)");
		System.out.print("������Ҫ���ҵ�Ա����ţ�");
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
			System.out.println("û�����Ա����");
		}
		scan.close();
	}

}
