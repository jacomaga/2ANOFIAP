package loja;

import java.math.BigDecimal;

import loja.pedido.handler.SituacaoHandler;
import loja.pedido.situacao.Aberto;
import loja.pedido.situacao.Situacao;

public class Pedido implements PedidoInterface {

	private BigDecimal valor;
	private int QuantidadeDeItens;
	private Situacao situacao;
	private SituacaoHandler handler;
	
	@Override
	public String getEndereco() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Rua 123, São Paulo - SP";
	}
	
	public Pedido(BigDecimal valor, int quantidadeDeItens, Situacao situacao) {
		this.valor = valor;
		QuantidadeDeItens = quantidadeDeItens;
		this.situacao = new Aberto();
	}

	@Override
	public int getQuantidadeDeItens() {
		return QuantidadeDeItens;
	}

	@Override
	public void setQuantidadeDeItens(int quantidadeDeItens) {
		QuantidadeDeItens = quantidadeDeItens;
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = new BigDecimal("1");
		this.situacao = new Aberto();
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}

	@Override
	public void setSituacao(Situacao situacao) {
		handler.notify(this);
		this.situacao = situacao;
	}

	@Override
	public void pagar() throws StateException {
		this.situacao.pagar(this);
	}

	@Override
	public void entregar() throws StateException {
		this.situacao.entregar(this);

	}

	@Override
	public void cancelar() throws StateException {
		this.situacao.cancelar(this);

	}

	@Override
	public void reabrir() throws StateException {
		this.situacao.reabrir(this);

	}

	@Override
	public void abrirChamado() throws StateException {
		this.situacao.abrirChamado();

	}
}
