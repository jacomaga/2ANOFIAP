package loja.pedido.situacao;

import loja.PedidoInterface;
import loja.StateException;

public abstract class Situacao {
	
	public void pagar(PedidoInterface pedido) throws StateException {
		throw new StateException("Não pode transitar para pago");
	}
	
	public void entregar(PedidoInterface pedido) throws StateException {
		throw new StateException("Não pode transitar para entregue");
	}
	
	public void cancelar(PedidoInterface pedido) throws StateException {
		throw new StateException("Não pode transitar para cancelado");

	}
	
	public void reabrir(PedidoInterface pedido) throws StateException {
		throw new StateException("Não pode transitar para aberto");

	}

	public abstract void abrirChamado();
}
