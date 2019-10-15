package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class ListarSeguroAction extends ActionSupport{

	private List<Seguro> list = new ArrayList<Seguro>();
	
	@Override
	public String execute() throws Exception{
		try {
			DaoSeguro dao = new DaoSeguro();
			list = dao.listaSeguro();
			return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	public List<Seguro> getList() {
		return list;
	}

	public void setList(List<Seguro> list) {
		this.list = list;
	}	
}