package persistence;

import java.sql.*;
import java.util.List;

import model.Login;

public class Dao {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/segurado_struts?useTimezone=true&serverTimezone=UTC", "root", "root");
			System.out.println("Conectado!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public void close() throws Exception{
		con.close();
	}
}
