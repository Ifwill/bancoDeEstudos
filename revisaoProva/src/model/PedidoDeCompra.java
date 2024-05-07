package model;

public class PedidoDeCompra {
	private String dataDePedido;
	private boolean status;
	private String qualidadeSolida;
	
	public PedidoDeCompra(String dataDePedido, boolean status, String qualidadeSolida) {
		this.dataDePedido = dataDePedido;
		this.status = status;
		this.qualidadeSolida = qualidadeSolida;
	}
	public PedidoDeCompra() {
	}
	
	
	public String getDataDePedido() {
		return dataDePedido;
	}
	public void setDataDePedido(String dataDePedido) {
		this.dataDePedido = dataDePedido;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getQualidadeSolida() {
		return qualidadeSolida;
	}
	public void setQualidadeSolida(String qualidadeSolida) {
		this.qualidadeSolida = qualidadeSolida;
	}
	
	
	
	

}
