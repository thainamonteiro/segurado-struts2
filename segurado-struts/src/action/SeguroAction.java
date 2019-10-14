package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class SeguroAction extends ActionSupport{
	
	private String identificacao;
	private String valor;

	private Seguro seguro = new Seguro();

	@Override
	public String execute() throws Exception {
		DaoSeguro dao = new DaoSeguro();
		dao.create(seguro);
		return "success";	
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
}
