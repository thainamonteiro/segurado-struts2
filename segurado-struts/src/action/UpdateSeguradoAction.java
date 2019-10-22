package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Segurado;
import persistence.DaoSegurado;
  
public class UpdateSeguradoAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception{
		try {
			DaoSegurado dao = new DaoSegurado();
			Segurado segurado = new Segurado();
	
			dao.update(segurado);
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
