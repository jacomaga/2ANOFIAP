package loja.pedido.listener;

import loja.Pedido;

public class LogListener implements Listener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Escrevendo log..." + pedido);
	}

}
