package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Segurado;
import persistence.DaoSegurado;

public class ListarSeguradoAction extends ActionSupport {

	private List<Segurado> list = new ArrayList<Segurado>();

	@Override
	public String execute() throws Exception {
		try {
			DaoSegurado dao = new DaoSegurado();
			list = dao.listaSegurado();

			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	public List<Segurado> getList() {
		return list;
	}

	public void setList(List<Segurado> list) {
		this.list = list;
	}
}