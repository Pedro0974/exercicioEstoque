package edu.pedro.exercicio;

import java.util.ArrayList;

public class Loja {

	private ArrayList<Produto> estoque;

	public Loja() {
		estoque = new ArrayList<Produto>();
	}
	// metodo que adiciona produto na lista do estoque
	public void adicionarProduto(Produto produto) {
		estoque.add(produto);
	}
	// metodo que le os itens do estoque comparando o nome para remover
	public void removerDoEstoque(String nomeProduto) {
		// for que corre todo o arraylist
		for (int i = 0; i < estoque.size(); i++) {
			// if que verifica se o nome do parametro é igual a algum nome dentro do array
			// list
			if (estoque.get(i).getNome().equals(nomeProduto)) {
				// se for igual ele remove
				estoque.remove(i);
				break;
			}
		}
	}
	// metodo para buscar o produto pelo nome
	public Produto buscarProduto(String nomeProduto) {
		// for que percorre todo o arraylist
		for (int i = 0; i < estoque.size(); i++) {
			// if que verifica cada nome na lista ate achar o que é igual ao a string
			// passada como parametro
			if (estoque.get(i).getNome().equals(nomeProduto)) {
				Produto produtoEncontrado = estoque.get(i);
				System.out.println("Produto encontrado: " + produtoEncontrado);
			}
		}
		return null;
	}
	// metodo para listar o estoque todo
	public void listarEstoque() {
		// for que percorre o tamanho do ArrayList impriminto cada nome do produto na
		// ordem de inserção
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println("Produto " + (i + 1) + ": " + estoque.get(i).getNome());
		}
	}
	// metodo para efetuar a venda de um produto e remover a quantidade do estoque
	public double venderProduto(String nomeProduto, int quantidadeVenda) {
		// foeach que passa lendo todos os produtos do estoque
		for (Produto produto : estoque) {
			// if que verifica se o nome do produto do estoque é o mesmo do produto do
			// parametro
			if (produto.getNome().equals(nomeProduto)) {
				// se for igual e a quantidade for mais que a quantidade a ser vendida
				if (produto.getQuantidadeEmEstoque() >= quantidadeVenda) {
					// subtrai a quantidade do estoque e calcula o valor da venda
					produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeVenda);
					double valorVenda = produto.getPreco() * quantidadeVenda;
					System.out.println("Venda realizada com sucesso. Valor total: " + valorVenda);
					System.out.println(
							"Novo estoque do produto " + produto.getNome() + ": " + produto.getQuantidadeEmEstoque());
					return valorVenda;
				} else {
					// se a quantidade nao for maior do que a que for vendida retorna uma menssagem
					System.out.println("Quantidade em estoque insuficiente para realizar a venda.");
					return -1;
				}
			}
		}
		// e o produto nao for encontrado, retorna uma mensagem e -1 como pedido no
		// enunciado
		System.out.println("Produto não encontrado.");
		return -1;
	}
	// metodo sobrecarregado para adicionar apenas unidade ao estoque de um produto
	public void adicionarProduto(String nomeProduto, int quantidade) {
		// reuso do metodo buscar produto para verificar se é igual a string passada
		// como parametro
		Produto produto = buscarProduto(nomeProduto);

		// if que verifica se o produto passado existe e soma a quantidade com a
		// quantidade atual
		if (produto != null) {
			produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidade);
		}
	}
	// sobrecarga do metodo de remover pra remover apenas a quantidade do estoque
	public void removerProduto(String nomeProduto, int quantidade) {
		// reuso do metodo buscar produto para verificar se é igual a string passada
		// como parametro
		Produto produto = buscarProduto(nomeProduto);

		// if que verifica se o produto passado existe e se a quantidade é maior do que
		// a que vamos remover
		if (produto != null && produto.getQuantidadeEmEstoque() >= quantidade) {
			produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
		}
	}

}
