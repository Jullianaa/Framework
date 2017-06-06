package model;

public class Rendimento {
	
	private String nomeEmpresa;
	private String nomeProduto;
	private int quantProdutos;
	private float precoProduto;
	private float lucroMensal;
	private float saldoTotal;
	
	public Rendimento(String nomeEmpresa,String nomeProduto, int quantProdutos, float precoProduto,float lucroMensal, float saldoTotal ){
		
		setNomeEmpresa(nomeEmpresa);
		setNomeProduto(nomeProduto);
		setQuantProdutos(quantProdutos);
		setPrecoProduto(precoProduto);
		setLucroMensal(lucroMensal);
		setSaldoTotal(saldoTotal);
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		//serão validados se é possível existir aquele nome de empresa. 
		//Por exemplo, não podendo existir caracteres especiais
		this.nomeEmpresa = nomeEmpresa;
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

	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
		
}

