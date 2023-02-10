package desafios;

public class MultiplosDeTresHastaCien {

	public static void main(String[] args) {
		// Prints out multiples of 3, between 1 and 100
		// 1st implementation
		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}

		// 2nd implementation
		for (int multiplo = 3; multiplo <= 100; multiplo += 3) {
			System.out.println(multiplo);
		}
	}
}
