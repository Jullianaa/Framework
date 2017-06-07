package model;

public class Rendimento {
	
	private String nomeProduto;
	private int quantProdutos;
	private float precoProduto;
	private float lucroMensal;
		
	
	public Rendimento(String nomeProduto, int quantProdutos, float precoProduto ){
		setNomeProduto(nomeProduto);
		setQuantProdutos(quantProdutos);
		setPrecoProduto(precoProduto);
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantProdutos() {
		return quantProdutos;
	}

	public void setQuantProdutos(int quantProdutos) {
		this.quantProdutos = quantProdutos;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public float getLucroMensal() {
		return lucroMensal;
	}

	public void setLucroMensal(float lucroMensal) {
		this.lucroMensal = lucroMensal;
	}
	
}


