package loja.pedido.situacao;

import loja.Pedido;
import loja.StateException;

public abstract class Situacao {
	
	public void pagar(Pedido pedido) throws StateException {
		throw new StateException("Não pode transitar para pago");
	}
	
	public void entregar(Pedido pedido) throws StateException {
		throw new StateException("Não pode transitar para entregue");
	}
	
	public void cancelar(Pedido pedido) throws StateException {
		throw new StateException("Não pode transitar para cancelado");

	}
	
	public void reabrir(Pedido pedido) throws StateException {
		throw new StateException("Não pode transitar para aberto");

	}

	public abstract void abrirChamado();
}
