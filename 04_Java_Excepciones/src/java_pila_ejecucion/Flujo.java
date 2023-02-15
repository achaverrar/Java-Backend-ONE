package java_pila_ejecucion;

public class Flujo {
	public static void main(String args[]) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			// try and catch statements help us handle exceptions
			// An uncaught exception will stop the execution of the program
			// try and catch statements go hand in hand
			try {
				// When the execution finds an exception,
				// skips the rest of the body of the try statement
				// and jumps to the body of the catch statement
				if (i == 3) {
					int num = 0;
					int resultado = i / num;
					System.out.println(resultado);
				}
				// When i is 3, there's only one exception being caught
				// and that's an Arithmetic exception
				// The code never gets to that of the type NullPointer
				String test = null;
				System.out.println(test.toString());
			}
			// Exceptions are objects in Java
			// There are multiple types of exceptions
			// The multi-catch statements in Java allow us to catch
			// multiple types of exceptions in the same catch
			// Case 3: handling two types of exception in the same catch
			catch (ArithmeticException | NullPointerException exception) {
				System.out.println("Atrapa Excepcion");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
		}
		System.out.println("Fin metodo2");
	}
}
