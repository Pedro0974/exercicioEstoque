package edu.pedro.exercicio;

public class Main {

	public static void main(String[] args) {

		Loja loja = new Loja();

		Produto produto1 = new Produto("Torta no Pote", "recheio bolo e recheio", 11.90, 10);
		Produto produto2 = new Produto("Super Fatia", "bolo recheio e bolo", 19.90, 8);
		Produto produto3 = new Produto("Pudim", "bomba de açucar", 9.50, 20);
		Produto produto4 = new Produto("Copo Bolha", "so creme e brownie", 19.90, 25);
		Produto produto5 = new Produto("Bombom Aberto", "cremes e pedações de morango", 14.5, 15);
		Produto produto6 = new Produto("Coxinha de Morango", "morango inteiro com brigadeiro em volta", 8.5, 30);

		loja.adicionarProduto(produto1);
		loja.adicionarProduto(produto2);
		loja.adicionarProduto(produto3);
		loja.adicionarProduto(produto4);
		loja.adicionarProduto(produto5);
		loja.adicionarProduto(produto6);

		System.out.println("Teste metodo listarEstoque: ");
		loja.listarEstoque();

		System.out.println("\nTeste metodo removerDoEstoque: ");
		loja.removerDoEstoque("Torta no Pote");
		
		loja.listarEstoque();

		System.out.println("\nTeste metodo buscarProduto: ");
		loja.buscarProduto("Copo Bolha");

		System.out.println("\nTeste metodo venderProduto quando tiver o produto: ");
		loja.venderProduto("Pudim", 3);

		System.out.println("\nTeste metodo venderProduto quando não tiver o produto: ");
		loja.venderProduto("Torta no Pote", 4);

	}

}
