package desafios;

public class Factorial {

	public static void main(String[] args) {
		// Prints out the factorial of numbers from 1 to 10
		// 1st implementation
		int factorial = 1;
		for (int n = 1; n <= 10; n++) {
			factorial *= n;
			System.out.println(factorial);
		}

		// 2nd implementation
		for (int n = 1; n <= 10; n++) {
			int producto = 1;
			for (int factor = n; factor >= 1; factor--) {
				producto *= factor;
			}
			System.out.println(producto);
		}
	}

}
