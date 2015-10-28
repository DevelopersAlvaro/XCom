package br.com.taipanet.model;


public enum TipoContaEnum {
	P("Conta a pagar"), R("Conta a receber");
	
	private String valor;
	
	private TipoContaEnum(String valor) {
		// TODO Auto-generated constructor stub
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
}
