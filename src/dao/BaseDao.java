package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn;
	// ������ӵķ���
	public static Connection getConnection() {
		try {
			// ����jdbc������
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Student?UseUnicode=true&characterEncoding=UTF-8",
					"root", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
