package Controller;

import model.*;

import java.util.Scanner;

public class AntigoRendimento {

	public void calculaRendimento(float recursosHumanos, float alimentacao){
		System.out.println("Nome do produto: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String nomeProduto = scanner.nextLine();
		System.out.println("Quantidade de produtos:");
		int quantProdutos = scanner.nextInt();
		System.out.println("Preço dos produtos:");
		float precoProduto = scanner.nextFloat();
		
		Rendimento rend = new Rendimento(nomeProduto, quantProdutos, precoProduto);
	
	    float total = recursosHumanos + alimentacao;
	    float saldoBruto = (float) ((quantProdutos * precoProduto) - (0.4 * total));
	 	
		rend.setLucroMensal(saldoBruto);
		
		System.out.println("Lucro mensal: " + rend.getLucroMensal());
	}
}
