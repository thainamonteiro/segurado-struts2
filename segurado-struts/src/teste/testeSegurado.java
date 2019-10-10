package teste;

import model.Segurado;
import persistence.DaoSegurado;

public class testeSegurado {
	public static void main(String[] args) {
		DaoSegurado s = new DaoSegurado();
	Segurado segurado = new Segurado("teste1", "teste2", "teste3", "teste4", "teste5", "teste6", "teste7", "teste8", "teste9");
		
		try {
			s.create(segurado);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
