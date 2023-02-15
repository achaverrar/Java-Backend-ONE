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
				int num = 0;
				int resultado = i / num;
				System.out.println(resultado);
			}
			// Exceptions are objects in Java
			// There are multiple types of exceptions
			// Case 1: catching an exception of the type ArithmeticException
			catch (ArithmeticException exception) {
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
		}
		System.out.println("Fin metodo2");
	}
}
