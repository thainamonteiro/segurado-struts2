package teste;

import org.junit.Test;

import model.Login;
import persistence.DaoLogin;

public class testeLogin {
	@Test
	public void testarLogin() {
		DaoLogin dao = new DaoLogin();
		Login login = new Login("admin", "123");
		
		if(dao.checkLogin(login)) {
			System.out.println("Pode entrar :)");
		}else {
			System.out.println("Não pode entrar! :(");
		}
	}
}
