package loja;

import java.math.BigDecimal;

import loja.pedido.handler.SituacaoHandler;
import loja.pedido.situacao.Aberto;
import loja.pedido.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private int QuantidadeDeItens;
	private Situacao situacao;
	private SituacaoHandler handler;
	
	public Pedido(BigDecimal valor, int quantidadeDeItens, Situacao situacao) {
		this.valor = valor;
		QuantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
	}

	public int getQuantidadeDeItens() {
		return QuantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		QuantidadeDeItens = quantidadeDeItens;
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = new BigDecimal("1");
		this.situacao = new Aberto();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		handler.notify(this);
		this.situacao = situacao;
	}

	public void pagar() throws StateException {
		this.situacao.pagar(this);
	}

	public void entregar() throws StateException {
		this.situacao.entregar(this);

	}

	public void cancelar() throws StateException {
		this.situacao.cancelar(this);

	}

	public void reabrir() throws StateException {
		this.situacao.reabrir(this);

	}

	public void abrirChamado() throws StateException {
		this.situacao.abrirChamado();

	}
}
