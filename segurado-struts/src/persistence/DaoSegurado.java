package persistence;

import model.Segurado;

public class DaoSegurado extends Dao {
	public void create(Segurado s) throws Exception {
		try {
			open();
			
			stmt = con.prepareStatement("insert into segurado values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, s.getNome());
			stmt.setString(2, s.getCpf());
			stmt.setString(3, s.getRg());
			stmt.setString(4, s.getSexo());
			stmt.setString(5, s.getCorrentista());
			stmt.setString(6, s.getDiasVisita());	
			stmt.setString(7, s.getData_nas());
			stmt.setString(8, s.getData_cad());	
			stmt.setString(9, s.getData_alt());
			stmt.execute();
			
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
