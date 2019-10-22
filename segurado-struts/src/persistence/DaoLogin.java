package persistence;

import java.sql.Connection;
import java.util.List;

import model.Login;
import model.Segurado;

public class DaoLogin extends Dao {

	public boolean checkLogin(Login login) {
		boolean status = false;
		try {
			open();

			stmt = con.prepareStatement("SELECT  usuario, senha from Login WHERE usuario = '" + login.getUsuario() + "' AND senha = '" + login.getSenha() +"';");
			
//			stmt.setString(1, login.getUsuario());
//			stmt.setString(2, login.getSenha());
			
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
