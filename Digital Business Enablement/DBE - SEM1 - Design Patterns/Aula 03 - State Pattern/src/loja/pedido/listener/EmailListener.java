package loja.pedido.listener;

import loja.Pedido;

public class EmailListener implements Listener  {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviando e-mail..... ");
	}

}
