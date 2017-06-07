package main;

import Controller.Adapter;
import Controller.AntigoRendimento;

public class Testa {
	
	public static void main(String[] args) {
		AntigoRendimento antigoRendimento = new Adapter();
		float recursosHumanos = 300;
		float alimentacao = 150;
		antigoRendimento.calculaRendimento(recursosHumanos, alimentacao);
	}

}
