package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class SeguroAction extends ActionSupport{

	private Seguro seguro = new Seguro();

	
	@Override
	public String execute() throws Exception {
		DaoSeguro dao = new DaoSeguro();
		dao.create(seguro);
		return "Save";	
	}
}
