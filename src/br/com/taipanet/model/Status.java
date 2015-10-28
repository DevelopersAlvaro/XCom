package br.com.taipanet.model;


public enum Status {
	A("Ativo"), I("Inativo");
	
	private String valor;
	
	private Status(String valor) {
		// TODO Auto-generated constructor stub
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
