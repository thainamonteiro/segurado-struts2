package persistence;

import java.util.ArrayList;
import java.util.List;

import model.Segurado;

public class DaoSegurado extends Dao {
	public void create(Segurado s) throws Exception {
		try {
			open();
			String sql = "insert into segurado values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = con.prepareStatement(sql);
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
	
	public List<Segurado> listaSegurado() throws Exception{
		try {
			open();
			
			stmt = con.prepareStatement("select * from segurado");
			rs = stmt.executeQuery();
			List<Segurado> list = new ArrayList<Segurado>();
			
			while(rs.next()) {
				Segurado s = new Segurado();
				s.setIdSegurado(rs.getInt("idsegurado"));
				s.setNome(rs.getString("nome"));
				s.setCpf(rs.getString("cpf"));
				s.setRg(rs.getString("rg"));
				s.setSexo(rs.getString("sexo"));
				s.setCorrentista(rs.getString("correntista"));
				s.setDiasVisita(rs.getString("dias_visita"));
				s.setData_nas(rs.getString("data_nasc"));
				s.setData_cad(rs.getString("data_cad"));
				s.setData_alt(rs.getString("data_alt"));
				list.add(s);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Segurado buscaId(int id) throws Exception{
		try {
			open();
			stmt = con.prepareStatement("select * from segurado where idsegurado = ?");
			rs = stmt.executeQuery();
			Segurado s = null;
			
			if(rs.next()) {
			s = new Segurado();
			s.setIdSegurado(rs.getInt("idsegurado"));
			s.setNome(rs.getString("nome"));
			s.setCpf(rs.getString("cpf"));
			s.setRg(rs.getString("rg"));
			s.setSexo(rs.getString("sexo"));
			s.setCorrentista(rs.getString("correntista"));
			s.setDiasVisita(rs.getString("dias_visita"));
			s.setData_nas(rs.getString("data_nas"));
			s.setData_cad(rs.getString("data_cad"));
			s.setData_alt(rs.getString("data_alt"));
			return s;			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}


