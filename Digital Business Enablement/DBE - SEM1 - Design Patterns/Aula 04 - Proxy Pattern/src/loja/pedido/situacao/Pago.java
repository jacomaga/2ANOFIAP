package loja.pedido.situacao;

import loja.PedidoInterface;
import loja.StateException;

public class Pago extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Chamado aberto para logística");
	}

	@Override
	public void entregar(PedidoInterface pedido) throws StateException {
		pedido.setSituacao(new Entregue());
}

	@Override
	public void cancelar(PedidoInterface pedido) throws StateException {
		pedido.setSituacao(new Cancelado());
	}

}
