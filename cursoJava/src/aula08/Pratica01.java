package aula08;

public class Pratica01 {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoa = 3;
		
		boolean acompanhado;
		
		if (quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor do acompanhado é: " + acompanhado); // para saber se é true ou false //

		if (idade >= 18 && acompanhado) { // e/and = &&
			System.out.println("Você pode comprar uma bebida.");
		} else {
			System.out.println("Não pode comprar bebida.");
		}
	}
}
