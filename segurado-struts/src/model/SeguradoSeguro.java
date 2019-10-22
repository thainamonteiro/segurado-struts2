package model;

public class SeguradoSeguro {
	private int idseguro;
	private int idsegurado;
	
	public SeguradoSeguro() {
		
	}
	
	public SeguradoSeguro(int idseguro, int idsegurado) {
		this.idseguro = idseguro;
		this.idsegurado = idsegurado;
	}

	public int getIdseguro() {
		return idseguro;
	}

	public void setIdseguro(int idseguro) {
		this.idseguro = idseguro;
	}

	public int getIdsegurado() {
		return idsegurado;
	}

	public void setIdsegurado(int idsegurado) {
		this.idsegurado = idsegurado;
	}

	@Override
	public String toString() {
		return "SeguradoSeguro [idseguro=" + idseguro + ", idsegurado=" + idsegurado + "]";
	}
	
	
}
