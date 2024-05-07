package model;

public class Produto {
	private String nome;
	private String descricao;
	private int numeracao;
	
	public Produto(String nome, String descricao, int numeracao) {
		this.nome = nome;
		this.descricao = descricao;
		this.numeracao = numeracao;
	}
	
	public Produto() {
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	
	

}
