package edu.pedro.exercicio;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Produto> estoque;
	
	public Loja() {
		estoque = new ArrayList<Produto>();
	}
	
	//metodo que adiciona produto na lista do estoque
	public void adicionarProduto(Produto produto) {
		estoque.add(produto);
	}
	
	// metodo que le os itens do estoque comparando o nome para remover
	public void removerDoEstoque(String nomeProduto) {
		//for que corre todo o arraylist
		for ( int i = 0; i < estoque.size(); i++) {
			//if que verifica se o nome do parametro é igual a algum nome dentro do array list
			if(estoque.get(i).getNome().equals(nomeProduto)) {
				//se for igual ele remove
				estoque.remove(i);
				break;
			}
		}
	}
	
	// metodo para buscar o produto pelo nome
	public Produto buscarProduto(String nomeProduto) {
		//for que percorre todo o arraylist 
		for( int i =0; i<estoque.size(); i++) {
			//if que verifica cada nome na lista ate achar o que é igual ao a string passada como parametro
			if(estoque.get(i).getNome().equals(nomeProduto)) {
				Produto produtoEncontrado = estoque.get(i);
				System.out.println("Produto encontrado: "+ produtoEncontrado);
			}
		}
		return null;
	}
	
	
	//metodo para listar o estoque todo
	public void listarEstoque() {
		//for que percorre o tamanho do ArrayList impriminto cada nome do produto na ordem de inserção 
		 for (int i = 0; i < estoque.size(); i++) {
	            System.out.println("Produto " + (i + 1) + ": " + estoque.get(i).getNome());
	        }
	}
	
	
	// metodo para efetuar a venda de um produto e remover a quantidade do estoque
	public double venderProduto(String nomeProduto, int quantidadeVenda) {
		//reuso do metodo buscar produto para verificar se é igual a string passada como parametro
		Produto produto = buscarProduto(nomeProduto);
		
		// if que verifica se o nome do produto existe e se a quantidade do estoque é maior que a quantidade de venda
		if(produto != null && produto.getQuantidadeEmEstoque()>= quantidadeVenda) {
			//algoritimo para subtrair a quantidade vendida do total do estoque
			produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()- quantidadeVenda);
			// retorna o valor total da venda efetuada
			System.out.println("Novo Estoque: "+ produto.getQuantidadeEmEstoque());
			return produto.getPreco()*quantidadeVenda;
		}
		// se o if de cima for verdade retorna -1 como pedido no enunciado 
		return -1;
	}
	
	// metodo sobrecarregado para adicionar apenas unidade ao estoque de um produto
	public void adicionarProduto(String nomeProduto, int quantidade) {
		//reuso do metodo buscar produto para verificar se é igual a string passada como parametro
		Produto produto = buscarProduto(nomeProduto);
		
		//if que verifica se o produto passado existe e soma a quantidade com a quantidade atual
		if(produto!=null) {
			produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque()+quantidade);
		}
	}
	
	// sobrecarga do metodo de remover pra remover apenas a quantidade do estoque
	public void removerProduto (String nomeProduto, int quantidade) {
		//reuso do metodo buscar produto para verificar se é igual a string passada como parametro
		Produto produto = buscarProduto(nomeProduto);
		
		// if que verifica se o produto passado existe e se a quantidade é maior do que a que vamos remover
		if (produto != null && produto.getQuantidadeEmEstoque() >= quantidade) {
	        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
	    }
	}
	
	
	
	
}
