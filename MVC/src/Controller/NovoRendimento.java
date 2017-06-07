package Controller;

import java.util.Scanner;

import model.Rendimento;

public class NovoRendimento {
	
	public void calculaRendimento(float recursosHumanos, float alimentacao, float saude, float transporte) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome do produto:");
		String nomeProduto = scanner.nextLine();
		System.out.println("Quantidade de produtos:");
		int quantProdutos = scanner.nextInt();
		System.out.println("Preço dos produtos:");
		float precoProduto = scanner.nextFloat();
		
		Rendimento rendimento = new Rendimento(nomeProduto, quantProdutos, precoProduto);
		
		float total = recursosHumanos + alimentacao + saude + transporte;
		
		float valorBruto = (float) ((quantProdutos * precoProduto) - (0.5 * total));
		
		rendimento.setLucroMensal(valorBruto); //Atualiza-se a model com o valor calculado
		
		System.out.println("Lucro mensal: " + rendimento.getLucroMensal());
	}

}
