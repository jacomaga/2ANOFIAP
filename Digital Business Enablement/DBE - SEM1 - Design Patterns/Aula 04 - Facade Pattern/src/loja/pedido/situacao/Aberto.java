package loja.pedido.situacao;

import loja.PedidoInterface;
import loja.StateException;

public class Aberto extends Situacao{

	@Override
	public void abrirChamado() {
		new ChamadoFacade().abrir(null);
		System.out.println("Chamada aberto para financeiro");
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
