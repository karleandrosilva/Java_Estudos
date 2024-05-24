package aula07;

public class Pratica02 {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >= 2;
		
		System.out.println("Valor do acompanhado é: " + acompanhado); // para saber se é true ou false //
		
		if (idade >= 18 && acompanhado) { // e/and = &&
			System.out.println("Você pode comprar uma bebida.");
		} else {
			System.out.println("Não pode comprar bebida.");
		}
	}
}
