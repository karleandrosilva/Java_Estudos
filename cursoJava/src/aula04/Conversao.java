package aula04;

public class Conversao {

	public static void main(String[] args) {
		double salario = 2700.50; 
		int valor = (int) salario; // fazendo um cast explicito
		
		System.out.println(valor);
		
		// cast é uma operação que permite converter um tipo de dado em outro. 
		
		// 1) Casting Implícito (Widening)
		//O casting implícito ocorre automaticamente quando você está
		//convertendo um tipo menor para um tipo maior.
		
		// 2) Casting Explícito (Narrowing)
		//quando você deseja converter um tipo maior para um tipo menor.
		//Como essa operação pode resultar em perda de dados, você
		//precisa especificar o casting de forma explícita. Isso é
		//feito colocando o tipo desejado entre parênteses antes
		//do valor a ser convertido.
	}

}
