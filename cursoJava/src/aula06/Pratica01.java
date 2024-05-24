package aula06;

public class Pratica01 {
	public static void main(String[] args) {
		System.out.println("Testando condiconais");
		int idade = 15;
		int quantidadePessoa = 1;
		
		
		if (idade >= 18) {
			System.out.println("Ok, você tem mais de 18 anos.");
			System.out.println("Você pode comprar uma bebida.");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Ok, você é menor de idade mas pode comprar pois está acompanhado.");
			} else {
				System.out.println("Você tem menos de 18 anos.");
				System.out.println("Não pode comprar bebida.");
			}

		}
	}
}
