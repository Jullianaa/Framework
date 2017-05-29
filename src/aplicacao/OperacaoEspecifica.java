package aplicacao;

import caixaBranca.Operacao;

public class OperacaoEspecifica extends Operacao{

	@Override 
	public void somaDoisNumeros(int primeiroTermo, int segundoTermo) {
		// TODO Auto-generated method stub
		System.out.println("Soma = " + (primeiroTermo + segundoTermo) );
		
	}

	@Override
	public void multiplicaDoisNumeros(int primeiroTermo, int segundoTermo) {
		// TODO Auto-generated method stub
		System.out.println("Multiplicação: " + (primeiroTermo * segundoTermo));
		
	}
	
}
