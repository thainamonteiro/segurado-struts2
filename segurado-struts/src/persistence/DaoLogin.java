package persistence;

import java.sql.Connection;

import model.Login;

public class DaoLogin extends Dao {

	public boolean checkLogin(Login login) {
		boolean status = false;
		try {
			open();

			stmt = con.prepareStatement("SELECT l from Login l WHERE usuario = :usuario AND senha = :senha");
			
			stmt.setString(1, login.getUsuario());
			stmt.setString(2, login.getSenha());
			
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
