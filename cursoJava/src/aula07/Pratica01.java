package aula07;

public class Pratica01 {
	public static void main(String[] args) {
		int idade = 20;
		boolean acompanhado = false;

		if (idade >= 18 && acompanhado) { // e/and = &&
			System.out.println("Você pode comprar uma bebida.");
		} else {
			System.out.println("Não pode comprar bebida.");
		}
	}
}
