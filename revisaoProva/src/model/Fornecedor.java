package model;

public class Fornecedor {
	private String nome;
	private String contato;
	private boolean infPagamento;
	
	public Fornecedor(String nome, String contato, boolean infPagamento) {
		this.nome = nome;
		this.contato = contato;
		this.infPagamento = infPagamento;
	}
	
	public Fornecedor() {
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public boolean getInfPagamento() {
		return infPagamento;
	}
	public void setInfPagamento(boolean infPagamento) {
		this.infPagamento = infPagamento;
	}
	
	
}
