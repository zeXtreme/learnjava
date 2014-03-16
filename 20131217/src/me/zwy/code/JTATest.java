package me.zwy.code;

import java.sql.Connection;
import java.sql.SQLException;

import me.zwy.util.DBConnection;

public class JTATest {

	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
