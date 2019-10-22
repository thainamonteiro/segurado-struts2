package action;

import org.apache.struts2.views.jsp.ui.SubmitTag;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class UpdateSeguroAction extends ActionSupport {
	
	private String identificacao;
	private Double valor;
	private int idseguro;

	
	@Override
	public String execute() throws Exception{
		try {
			DaoSeguro dao = new DaoSeguro();
			Seguro seguro = new Seguro();
			
//			seguro = dao.update(seguro);
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}


	public String getIdentificacao() {
		return identificacao;
	}


	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public int getIdseguro() {
		return idseguro;
	}


	public void setIdseguro(int idseguro) {
		this.idseguro = idseguro;
	}
}