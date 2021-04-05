package loja;

import java.math.BigDecimal;

public class Pedido {
	
	BigDecimal valor;
	int QuantidadeDeItens;

	public int getQuantidadeDeItens() {
		return QuantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		QuantidadeDeItens = quantidadeDeItens;
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
