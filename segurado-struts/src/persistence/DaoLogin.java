package persistence;

import java.sql.Connection;

public class DaoLogin extends Dao{

	public boolean checkLogin(String usuario, String senha) {
		boolean status = false;
		try {

			stmt = con.prepareStatement("SELECT l from Login l WHERE usuario = :usuario AND senha = :senha");
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				return true;

			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	
	}
}
