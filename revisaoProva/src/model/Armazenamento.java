package model;

public class Armazenamento {
	private String endereco;
	private String capadadeDeArmazenamento;
	
	public Armazenamento(String endereco, String capadadeDeArmazenamento) {
		this.endereco = endereco;
		this.capadadeDeArmazenamento = capadadeDeArmazenamento;
	}
	public Armazenamento() {
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCapadadeDeArmazenamento() {
		return capadadeDeArmazenamento;
	}
	public void setCapadadeDeArmazenamento(String capadadeDeArmazenamento) {
		this.capadadeDeArmazenamento = capadadeDeArmazenamento;
	}
	
}
