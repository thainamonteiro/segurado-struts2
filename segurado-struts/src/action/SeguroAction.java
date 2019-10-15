package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Seguro;
import persistence.DaoSeguro;

public class SeguroAction extends ActionSupport{
	
	private String identificacao;
	private Double valor;

	@Override
	public String execute() throws Exception {
		Seguro s = new Seguro();
		DaoSeguro dao = new DaoSeguro();
		try {
			s.setIdentificacao(identificacao);
			s.setValor(valor);
			dao.create(s);
			
			return "success";	
		} catch (Exception e) {
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
	
	
}
