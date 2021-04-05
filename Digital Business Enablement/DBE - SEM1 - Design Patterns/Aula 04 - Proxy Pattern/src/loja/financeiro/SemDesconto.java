package loja.financeiro;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class SemDesconto extends Desconto{

	public SemDesconto(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean deveAplicar(PedidoInterface pedido) {
		return true;
	}

	@Override
	protected BigDecimal aplicar(PedidoInterface pedido) {
		return BigDecimal.ZERO;
	}

}
