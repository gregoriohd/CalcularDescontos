package br.com.gregoriosantos.descontos;

import br.com.gregoriosantos.produtos.Produto;

public class DescontosProdutos {

	private int quantidadeProdutos;
	private Produto produtos;

	public DescontosProdutos(Produto produto, int quantidadeProdutos) {

		this.produtos = produto;
		this.quantidadeProdutos = quantidadeProdutos;

	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public double valorDescontos() {

		if (getQuantidadeProdutos() > 10 && getQuantidadeProdutos() < 21)
			return getProdutos().getValorProduto() * 0.1;
		if (getQuantidadeProdutos() > 20 && getQuantidadeProdutos() < 51)
			return getProdutos().getValorProduto() * 0.2;
		if (getQuantidadeProdutos() > 51)
			return getProdutos().getValorProduto() * 0.25;
		return 0;
	}

}
