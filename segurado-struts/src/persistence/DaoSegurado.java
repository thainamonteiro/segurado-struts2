package persistence;

import java.util.ArrayList;
import java.util.List;

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
	
	public void delete(int idsegurado) throws Exception{
		try {
			open();
			stmt = con.prepareStatement("delete from segurado where idsegurado = ?");
			stmt.setInt(1, idsegurado);
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(Segurado s) throws Exception{
		try {
			open();
			stmt.getConnection().prepareStatement("update segurado set nome=?, cpf=?, rg=?, sexo=?, correntista=?, dias_visita=?, data_nasc=?, data_cad=?, data_alt=?");
			stmt.setString(1, s.getNome());
			stmt.setString(2, s.getCpf());
			stmt.setString(3, s.getRg());
			stmt.setString(4, s.getSexo());
			stmt.setString(5, s.getCorrentista());
			stmt.setString(6, s.getDiasVisita());	
			stmt.setString(7, s.getData_nas());
			stmt.setString(8, s.getData_cad());	
			stmt.setString(9, s.getData_alt());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Segurado> listaSegurado(){
		try {
			open();
			List<Segurado> segurados = new ArrayList<Segurado>();
			stmt = con.prepareStatement("select * from segurado");
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Segurado s = new Segurado();
				s.setIdSegurado(rs.getInt("idsegurado"));
				s.setNome(rs.getString("nome"));
				s.setCpf(rs.getString("nome"));
				s.setRg(rs.getString("rg"));
				s.setSexo(rs.getString("sexo"));
				s.setCorrentista(rs.getString("correntista"));
				s.setDiasVisita(rs.getString("dias_visita"));
				s.setData_nas(rs.getString("data_nas"));
				s.setData_cad(rs.getString("data_cad"));
				s.setData_alt(rs.getString("data_alt"));
				segurados.add(s);
			}
			return segurados;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}