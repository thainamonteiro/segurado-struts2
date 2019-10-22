package teste;
//
//	public String find() throws Exception {
//		SeguroDao sd = new SeguroDao();
//		
//		try {
//			this.seguro = sd.findById(id);
//			seguronome = this.seguro.getSeguro();
//			valor = this.seguro.getValor();
//			System.out.println(this.seguro);
//			return SUCCESS;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ERROR;
//		}
//	}
//
//	public String update() throws Exception {
//		try {
//			SeguroDao sd = new SeguroDao();
//			this.setSeguro(sd.findById(id));
//			
//			if(this.seguro != null ) {
//				this.seguro = new Seguro(id, seguronome, valor);
//				sd.update(this.seguro);
//				return SUCCESS;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ERROR;
//		}
//		return INPUT;
//	}
//
//	public Double getValor() {
//		return valor;
//	}
//
//	public void setValor(Double valor) {
//		this.valor = valor;
//	}
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public List<Seguro> getSeguroLista() {
//		return seguroLista;
//	}
//
//	public void setSeguroLista(List<Seguro> seguroLista) {
//		this.seguroLista = seguroLista;
//	}
//
//	public String getSeguronome() {
//		return seguronome;
//	}
//
//	public void setSeguronome(String seguronome) {
//		this.seguronome = seguronome;
//	}
//
//	public Seguro getSeguro() {
//		return seguro;
//	}
//
//	public void setSeguro(Seguro seguro) {
//		this.seguro = seguro;
//	}
//
//	
//
//
//}