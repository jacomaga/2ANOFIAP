package loja.pedido.listener;

import loja.PedidoInterface;

public class LogListener implements Listener {

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Escrevendo log..." + pedido);
	}

}
