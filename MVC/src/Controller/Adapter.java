package Controller;

import java.util.Scanner;

public class Adapter extends AntigoRendimento {

	@Override
	public void calculaRendimento(float recursosHumanos, float alimentacao) {
		
		NovoRendimento novoRendimento = new NovoRendimento();
		System.out.println("Gastos com saúde:");
		Scanner scanner = new Scanner(System.in);
		float saude = scanner.nextFloat();
		System.out.println("Gastos com transporte:");
		float transporte = scanner.nextFloat();
		novoRendimento.calculaRendimento(recursosHumanos, alimentacao, saude, transporte);
	}
}
