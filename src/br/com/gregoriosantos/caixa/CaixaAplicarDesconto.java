package br.com.gregoriosantos.caixa;

import br.com.gregoriosantos.descontos.DescontosProdutos;
import br.com.gregoriosantos.produtos.Produto;

public class CaixaAplicarDesconto {
	
	public void aplicar() {
		Produto produto = new Produto();
		produto.setNomeProduto("Feijão");
		produto.setValorProduto(6);
		
		DescontosProdutos descontosProdutos = new  DescontosProdutos(produto, 50);
		
		System.out.println("Produto: " + descontosProdutos.getProdutos().getNomeProduto());
		System.out.println("Valor por unidade do produto: R$" + descontosProdutos.getProdutos().getValorProduto());
		System.out.println("Quantidade Comprada : " + descontosProdutos.getQuantidadeProdutos());
		System.out.println("Valor total: R$" + descontosProdutos.getProdutos().getValorProduto() * descontosProdutos.getQuantidadeProdutos());
		System.out.println("Valor desconto a ser aplicado: R$" + descontosProdutos.valorDescontos());
		System.out.println("Total a Pagar: R$" + (descontosProdutos.getProdutos().getValorProduto() * descontosProdutos.getQuantidadeProdutos() - descontosProdutos.valorDescontos()));
		

	}

	public static void main(String[] args) {
		new CaixaAplicarDesconto().aplicar();
	}

}
