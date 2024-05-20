package aula03;

public class PontoFlutuante2 {
	public static void main(String[] args) {
		double conta = 3.5 / 2;
		System.out.println(conta); //1.75
		
		int conta2 = 3 / 2;
		System.out.println(conta2); //1
		
		double conta3 = 3 / 2;
		System.out.println(conta3); //1.0, pois ele divide o 3 por 2 e o depois do resultado ele coloca o ponto flutuante. 
		
		double conta4 = 3.0 / 2;
		System.out.println(conta4); //1.5, agora funcionou pq dividiu 3.0 por 2 que vai dar um número flutuante.
	}
}
