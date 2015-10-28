package br.com.taipanet.model;


public enum SexoEnum {
	M("Masculino"), F("Feminino");
	
	private String valor;
	
	private SexoEnum(String valor) {
		// TODO Auto-generated constructor stub
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
