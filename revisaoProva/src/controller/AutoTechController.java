package controller;


import model.Armazenamento;
import model.Fornecedor;
import model.MovimentacaoDeEstoque;
import model.PedidoDeCompra;
import view.AutoTechView;

public class AutoTechController {
	private Armazenamento armazenamento;
	private Fornecedor fornecedor;
	private MovimentacaoDeEstoque movimentacaoDeEstoque;
	private PedidoDeCompra pedidoDeCompra;
	private AutoTechView autotechview;
	
	public AutoTechController() {
		armazenamento = new Armazenamento();
		fornecedor = new Fornecedor();
		movimentacaoDeEstoque = new MovimentacaoDeEstoque();
		pedidoDeCompra = new PedidoDeCompra();
		autotechview = new AutoTechView();
	}
	
	
	public void start() {
		int op = 0;
		do {
			switch(autotechview.menu()) {
			
			}
			
		} while (op != 0);
	}

}
