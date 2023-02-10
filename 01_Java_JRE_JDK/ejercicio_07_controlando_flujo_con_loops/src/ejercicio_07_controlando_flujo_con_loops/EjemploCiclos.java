package ejercicio_07_controlando_flujo_con_loops;

import java.util.Iterator;

public class EjemploCiclos {

	public static void main(String[] args) {
		// While loop

		// Prints all natural numbers from 1 to 10
		int contador = 1;

		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}

		// Prints out the sum of all natural numbers from 1 to 10
		contador = 1;
		int total = 0;
		while (contador <= 10) {
			total += contador;
			contador++;
		}
		System.out.println("La suma de todos los n naturales de 1 a 10 es: " + total);

		// For loop
		// Prints all natural numbers from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Prints out the sum of all natural numbers from 1 to 10
		total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println("La suma de todos los n naturales de 1 a 10 es: " + total);

		// Nested loops
		// Prints out the multiplication tables of numbers from 1 to 10
		for (int numTabla = 1; numTabla <= 10; numTabla++) {
			for (int factor = 1; factor <= 10; factor++) {
				// System.out.print() needs an argument to compile
				System.out.print(numTabla * factor + " ");
			}
			// Arguments aren't mandatory for System.out.println()
			// If it's called without arguments, it'll simply print a new line
			System.out.println();
		}

		// Prints out a square matrix of asterisks
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < 10; columna++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// More complex loops
		// Prints out a upper-triangular matrix of asterisks
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < 10; columna++) {
				if (columna < fila) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		// Prints out an lower-triangular matrix of asterisks
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < fila; columna++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Prints out a diagonal matrix of asterisks
		for (int fila = 0; fila < 10; fila++) {
			for (int columna = 0; columna < 10; columna++) {
				if (columna == fila) {
					System.out.print("* ");
					break;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
