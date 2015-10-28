package br.com.taipanet.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean @ViewScoped
public class LoginBean {
	private String usuario;
	private String senha;
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
