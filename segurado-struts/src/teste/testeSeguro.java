package teste;

import model.Seguro;
import persistence.DaoSeguro;

public class testeSeguro {
	public static void main(String[] args) {
		DaoSeguro s = new DaoSeguro();
		Seguro seguro = new Seguro("Teste", 1500.00);
		
		try {
			s.create(seguro);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
