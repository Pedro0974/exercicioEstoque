package edu.pedro.exercicio;

public class Produto {

	// criando atrinutos da class produto
	private String nome;
	private String descricao;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto() {

	}
	// contrutor do objeto produto
	public Produto(String nome, String descricao, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	// criando Getters e Setters de Produto
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	// Sobrescrevendo o metodo toString
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quantidadeEmEstoque="
				+ quantidadeEmEstoque + "]";
	}
}
