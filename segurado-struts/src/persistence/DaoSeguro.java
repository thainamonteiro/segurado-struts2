package persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

import model.Seguro;

public class DaoSeguro extends Dao {
	public void create(Seguro s) throws Exception {
		try {
			open();
			String sql = "insert into seguro values (null, ?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, s.getIdentificacao());
			stmt.setDouble(2, s.getValor());
			stmt.execute();
			
			close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void delete(int idseguro) throws Exception {
		try {
			open();
			stmt = con.prepareStatement("delete from seguro where idseguro = ?");
			stmt.setInt(1 , idseguro);
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Seguro s) throws Exception {				
		try {
			open();
			stmt = con.prepareStatement("update seguro set identificacao=?, valor=?" + "where idseguro = ?");
			stmt.setString(1, s.getIdentificacao());
			stmt.setDouble(2, s.getValor());
			stmt.setInt(3, s.getIdseguro());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Seguro> listaSeguro() throws Exception{
		try {
			open();
		
			stmt = con.prepareStatement("select * from seguro");
			rs = stmt.executeQuery();
			List<Seguro> list = new ArrayList<Seguro>();
			
			while(rs.next()) {
				Seguro s = new Seguro();
				s.setIdseguro(rs.getInt("idseguro"));
				s.setIdentificacao(rs.getString("identificacao"));
				s.setValor(rs.getDouble("valor"));
				list.add(s);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}