package persistence;

import model.SeguradoSeguro;

public class DaoSeguradoSeguro extends Dao{
	public void create(SeguradoSeguro ss) throws Exception {
		try {
			open();
			String sql = "insert into seguradoxseguro (id_segurado, id_seguro)	values (?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,  ss.getIdsegurado());
			stmt.setInt(2, ss.getIdseguro());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}

}
