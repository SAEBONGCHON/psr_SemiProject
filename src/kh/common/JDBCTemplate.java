package kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCTemplate {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDiver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "gueljeok","GUELJEOK");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(conn != null)
			System.out.println("DB연결 성공이야!!!!");
		else
			System.out.println("DB연결 실패야 ㅋ푸하");
		
		return conn;
	}
}
