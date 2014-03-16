package me.zwy.work;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;
import me.zwy.util.DBConnection;

public class work1 {

	/**
	 * ����һ��Employee���ݿ��eid,ename,etel).
	 * ����һ��������Ա���Ĵ洢���̣�����Ϊ����3�У�
	 * ͬʱ���ء��ɹ�����ʧ�ܡ����ַ�����
	 * дһ��java������������洢���̵���ȷ��
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Connection conn = DBConnection.getConnection();
		CallableStatement cs = conn.prepareCall("{call add_employee(?,?,?,?)}");
		System.out.print("������Ա����ţ�");
		int eid = scan.nextInt();
		cs.setInt(1, eid);
		System.out.print("������Ա�����֣�");
		String ename = scan.next();
		cs.setString(2, ename);
		System.out.print("������Ա���绰��");
		String etel = scan.next();
		cs.setString(3, etel);
		cs.registerOutParameter(4, OracleTypes.VARCHAR);
		cs.execute();
		String result = cs.getString(4);
		System.out.println(result);
		scan.close();
	}

}
