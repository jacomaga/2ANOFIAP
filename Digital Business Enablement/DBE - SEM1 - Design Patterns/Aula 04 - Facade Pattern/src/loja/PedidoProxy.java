package loja;

import java.math.BigDecimal;

import loja.pedido.situacao.Situacao;

public class PedidoProxy implements PedidoInterface{

	private Pedido pedido;
	private  String endereco;
	
	
	public PedidoProxy(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	public String getEndereco() {
		if(endereco == null) endereco = pedido.getEndereco();
		return endereco;
	}

	public int getQuantidadeDeItens() {
		return pedido.getQuantidadeDeItens();
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		pedido.setQuantidadeDeItens(quantidadeDeItens);
	}

	public BigDecimal getValor() {
		return pedido.getValor();
	}

	public void setValor(BigDecimal valor) {
		pedido.setValor(valor);
	}

	public Situacao getSituacao() {
		return pedido.getSituacao();
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public void pagar() throws StateException {
		pedido.pagar();
	}

	public void entregar() throws StateException {
		pedido.entregar();
	}

	public void cancelar() throws StateException {
		pedido.cancelar();
	}

	public void reabrir() throws StateException {
		pedido.reabrir();
	}

	public void abrirChamado() throws StateException {
		pedido.abrirChamado();
	}
	
}
