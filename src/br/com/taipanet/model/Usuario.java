package br.com.taipanet.model;


import java.math.BigInteger;
import java.security.MessageDigest;

public class Usuario extends Pessoa{
	private String login;
	private String senha;
	private Status status;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String criarHash(String s){
		try {
			String resultado = "";
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(s.getBytes(),0,s.length());	
			resultado = new BigInteger(1,m.digest()).toString(16);
			System.out.println("HASH CRIADO: " + s + " - " + resultado);
			return resultado;
			} catch (Exception e){
				System.out.println("Não foi possível criar hash da string informada: " + e.getMessage());
				return "XXXX";
			}
	}

}
