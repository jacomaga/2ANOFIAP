package loja.pedido.listener;

import loja.PedidoInterface;

public class EmailListener implements Listener  {

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Enviando e-mail..... ");
	}

}
