package persistence;

import model.Seguro;

public class DaoSeguro extends Dao {
	public void create(Seguro s) throws Exception{
		try {

			open();
			
			stmt = con.prepareStatement("insert into seguro values (null, ?, ?)");
			stmt.setString(1, s.getIdentificacao());
			stmt.setDouble(2, s.getValor());
			
			stmt.execute();
			
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
