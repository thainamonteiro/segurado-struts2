package teste;

import org.junit.Test;

import model.Seguro;
import persistence.DaoSeguro;

public class testeSeguro {

	@Test
	public void update() {
		DaoSeguro s = new DaoSeguro();
		Seguro seguro1 = new Seguro();

		seguro1.setIdseguro(1);
		seguro1.setIdentificacao("Nomenovo");
		seguro1.setValor(325.0);
		try {
			s.update(seguro1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
