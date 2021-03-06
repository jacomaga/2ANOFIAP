package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	

	
	
	public BigDecimal calcular(PedidoInterface pedido) {
		
		BigDecimal valorOutroImposto = calcularImposto(pedido);
		BigDecimal valorImposto = pedido.getValor().multiply(new BigDecimal("0.5"));
		
		if (outroImposto != null) valorOutroImposto = outroImposto.calcular(pedido);
		
		return valorImposto.add(valorOutroImposto);
	}
	
	protected abstract BigDecimal calcularImposto(PedidoInterface pedido);
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
}
