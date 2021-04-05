package loja.pedido.situacao;

import loja.Pedido;
import loja.StateException;

public class Pago extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Chamado aberto para logística");
	}

	@Override
	public void entregar(Pedido pedido) throws StateException {
		pedido.setSituacao(new Entregue());
}

	@Override
	public void cancelar(Pedido pedido) throws StateException {
		pedido.setSituacao(new Cancelado());
	}

}
