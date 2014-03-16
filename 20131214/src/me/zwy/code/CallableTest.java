package me.zwy.code;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import oracle.jdbc.OracleTypes;
import me.zwy.util.DBConnection;

public class CallableTest {

	public static void main(String[] args) throws Exception{
		Connection conn = DBConnection.getConnection();
//		CallableStatement cs = conn.prepareCall("call p_jc(?)");
//		cs.registerOutParameter(1,OracleTypes.NUMBER);
//		cs.setInt(1, 5);
//		cs.execute();
//		int result = cs.getInt(1);
//		System.out.println("���Ϊ��" + result);
		CallableStatement cs = conn.prepareCall("call pkg_eee.p_findemp(?,?)");
		cs.setInt(1, 2000);
		cs.registerOutParameter(2, OracleTypes.CURSOR);//���ص����α�����
		cs.execute();
		ResultSet rs = (ResultSet) cs.getObject(2);
		ResultSetMetaData rsd = rs.getMetaData();
		for(int i = 1;i <= rsd.getColumnCount();i++){
			System.out.print(rsd.getColumnName(i) + "\t");
		}
		System.out.println();
		while(rs.next()){
			for(int i = 1;i <= rsd.getColumnCount();i++){
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
	}

}
