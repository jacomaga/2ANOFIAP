package loja.pedido.situacao;

import loja.Pedido;
import loja.StateException;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para financeiro");
	}

	@Override
	public void pagar(Pedido pedido) throws StateException {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(Pedido pedido) throws StateException {
		pedido.setSituacao(new Cancelado());
	}
	
	
}
