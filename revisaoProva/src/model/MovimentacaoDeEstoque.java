package model;

public class MovimentacaoDeEstoque {
	private int quantidade;
	private String qualidade;
	private String data;
	private boolean movimentacao;
	
	public MovimentacaoDeEstoque(int quantidade, String qualidade, String data, boolean movimentacao) {
		this.quantidade = quantidade;
		this.qualidade = qualidade;
		this.data = data;
		this.movimentacao = movimentacao;
	}
	
	public MovimentacaoDeEstoque() {
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(boolean movimentacao) {
		this.movimentacao = movimentacao;
	}

	
	
}
