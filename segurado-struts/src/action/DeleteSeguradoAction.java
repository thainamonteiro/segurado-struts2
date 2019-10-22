package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Segurado;
import persistence.DaoSegurado;

public class DeleteSeguradoAction extends ActionSupport {
	
	int idsegurado;
	
	@Override
	public String execute() throws Exception{
		try {
			DaoSegurado dao = new DaoSegurado();
			
			dao.delete(idsegurado);
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	public int getIdsegurado() {
		return idsegurado;
	}

	public void setIdsegurado(int idsegurado) {
		this.idsegurado = idsegurado;
	}
}

