package loja.pedido.situacao;

import loja.Pedido;
import loja.StateException;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Chamado aberto para comercial");
	}

	@Override
	public void reabrir(Pedido pedido) throws StateException {
		pedido.setSituacao(new Aberto());
	}

}
