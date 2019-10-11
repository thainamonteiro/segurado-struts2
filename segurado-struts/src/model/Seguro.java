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
	

	public Seguro(String identificacao, Double valor) {
		super();
		this.identificacao = identificacao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Seguro [identificacao=" + identificacao + ", valor=" + valor + "]";
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


	public int getId() {
		return idseguro;
	}


	public void setId(int id) {
		this.idseguro = id;
	}

}
