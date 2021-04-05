package loja.financeiro;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class DescontoPorQuantidade extends Desconto{

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		// TODO Auto-generated method stub
		return pedido.getQuantidadeDeItens() > 10;
	}

	@Override
	protected BigDecimal aplicar(PedidoInterface pedido) {
		// TODO Auto-generated method stub
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

}
