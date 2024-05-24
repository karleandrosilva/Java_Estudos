package aula06;

public class Pratica02 {
	public static void main(String[] args) {
		int idade = 19;
		int quantidadePessoa = 1;

		if (idade >= 18 || quantidadePessoa >= 2) { // ou/or = ||
			System.out.println("Você pode comprar uma bebida.");
		} else {
			System.out.println("Não pode comprar bebida.");
		}
	}
}
