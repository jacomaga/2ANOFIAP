package loja;

import java.math.BigDecimal;

import loja.pedido.situacao.Situacao;

public interface PedidoInterface {

	String getEndereco();

	int getQuantidadeDeItens();

	void setQuantidadeDeItens(int quantidadeDeItens);

	BigDecimal getValor();

	void setValor(BigDecimal valor);

	Situacao getSituacao();

	void setSituacao(Situacao situacao);

	void pagar() throws StateException;

	void entregar() throws StateException;

	void cancelar() throws StateException;

	void reabrir() throws StateException;

	void abrirChamado() throws StateException;

}