package br.com.taipanet.model;


import java.util.ArrayList;
import java.util.Calendar;

public class Perfil {
	private long id;
	private String descricao;
	private ArrayList<Action> acoes;
	private Status status;
	private Calendar dataCadastro;
	private Calendar ultimaAlteracao;
	private Usuario criador;
	private Usuario usuarioUltimaAlteracao;
	
	public Perfil() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Action> getAcoes() {
		return acoes;
	}

	public void setAcoes(ArrayList<Action> acoes) {
		this.acoes = acoes;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getUltimaAlteracao() {
		return ultimaAlteracao;
	}

	public void setUltimaAlteracao(Calendar ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}

	public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public Usuario getUsuarioUltimaAlteracao() {
		return usuarioUltimaAlteracao;
	}

	public void setUsuarioUltimaAlteracao(Usuario usuarioUltimaAlteracao) {
		this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
	}
	
}
