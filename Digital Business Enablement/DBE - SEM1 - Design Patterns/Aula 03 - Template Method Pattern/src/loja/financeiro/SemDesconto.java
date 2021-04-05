package loja.financeiro;

import java.math.BigDecimal;

import loja.Pedido;

public class SemDesconto extends Desconto{

	public SemDesconto(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

	@Override
	protected BigDecimal aplicar(Pedido pedido) {
		return BigDecimal.ZERO;
	}

}
