package teste;

import org.junit.Test;

import model.Segurado;
import persistence.DaoSegurado;

public class testeSegurado {

	
	@Test
	public void update() throws Exception {

		DaoSegurado s = new DaoSegurado();
		Segurado segurado = new Segurado();

		segurado.setIdSegurado(1);
		segurado.setCorrentista("teste");
		segurado.setCpf("teste");
		segurado.setData_alt("teste");
		segurado.setData_cad("teste");
		segurado.setData_nasc("teste");
		segurado.setDiasVisita("teste");
		segurado.setNome("teste");
		segurado.setRg("teste");
		segurado.setSexo("teste");
		s.update(segurado);
	}
	
}
