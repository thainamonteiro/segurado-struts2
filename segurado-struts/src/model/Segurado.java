package model;

import java.io.Serializable;
import java.util.List;

public class Segurado implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idsegurado;
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String correntista;
	private String diasVisita;
	private String data_nasc;
	private String data_cad;
	private String data_alt;
	List<Seguro> seguro;

	public Segurado() {
		super();
	}

	public Segurado(int idsegurado, String nome, String cpf, String rg, String sexo, String correntista,
			String diasVisita, String data_nasc, String data_cad, String data_alt, List<Seguro> seguro) {
		super();
		this.idsegurado = idsegurado;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.correntista = correntista;
		this.diasVisita = diasVisita;
		this.data_nasc = data_nasc;
		this.data_cad = data_cad;
		this.data_alt = data_alt;
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Segurado [idsegurado=" + idsegurado + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo="
				+ sexo + ", correntista=" + correntista + ", diasVisita=" + diasVisita + ", data_nasc=" + data_nasc
				+ ", data_cad=" + data_cad + ", data_alt=" + data_alt + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public String getDiasVisita() {
		return diasVisita;
	}

	public void setDiasVisita(String diasVisita) {
		this.diasVisita = diasVisita;
	}

	public String getData_nas() {
		return data_nasc;
	}

	public void setData_nas(String data_nas) {
		this.data_nasc = data_nas;
	}

	public String getData_cad() {
		return data_cad;
	}

	public void setData_cad(String data_cad) {
		this.data_cad = data_cad;
	}

	public String getData_alt() {
		return data_alt;
	}

	public void setData_alt(String data_alt) {
		this.data_alt = data_alt;
	}

	public int getIdSegurado() {
		return idsegurado;
	}

	public void setIdSegurado(int idsegurado) {
		this.idsegurado = idsegurado;
	}
}
