package Controller;
import java.util.Scanner;

import model.Rendimento;

public class AntigoRendimento {

	public void calculaRendimento(float recursosHumanos, float alimentacao){
		System.out.println("Nome do produto: ");
		Scanner scanner = new Scanner(System.in);
		String nomeProduto = scanner.nextLine();
		int quantProdutos = scanner.nextInt();
		float precoProduto = scanner.nextFloat();
		
		Rendimento rend = new Rendimento(nomeProduto, quantProdutos, precoProduto);
	
	    float saldoBruto;
		saldoBruto = (quantProduto*valorProduto) - (0.1 * total);
		
		rend.setLucroMensal(saldoBruto);
	}
}
