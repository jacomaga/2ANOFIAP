package loja.pedido.situacao;

public class Entregue extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("Chamado aberto para pós venda");
	}

}
