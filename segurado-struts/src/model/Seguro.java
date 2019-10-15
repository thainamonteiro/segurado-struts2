package model;

import java.io.Serializable;

public class Seguro implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idseguro;
	private String identificacao;
	private Double valor;

	public Seguro() {
		super();
	}
	

	public Seguro(int idseguro, String identificacao, Double valor) {
		super();
		this.idseguro = idseguro;
		this.identificacao = identificacao;
		this.valor = valor;
	}



	@Override
	public String toString() {
		return "Seguro [idseguro=" + idseguro + ", identificacao=" + identificacao + ", valor=" + valor + "]";
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
