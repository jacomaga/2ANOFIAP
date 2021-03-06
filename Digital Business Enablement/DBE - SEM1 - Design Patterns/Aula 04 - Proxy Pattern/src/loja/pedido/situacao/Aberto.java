package loja.pedido.situacao;

import loja.PedidoInterface;
import loja.StateException;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para financeiro");
	}

	@Override
	public void pagar(PedidoInterface pedido) throws StateException {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(PedidoInterface pedido) throws StateException {
		pedido.setSituacao(new Cancelado());
	}
	
	
}
