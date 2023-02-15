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
		// We can create and throw our own exceptions in Java
		// It's best practice to throw an exception without creating a reference to it
		// To show a customized message, we pass it as a String to its constructor 
		throw new ArithmeticException("Mensaje personalizado");
		// Only instances of the type Exception can thrown 
		// No lines of code in this body are allowed after the exception was explicitly thrown
	}
}
