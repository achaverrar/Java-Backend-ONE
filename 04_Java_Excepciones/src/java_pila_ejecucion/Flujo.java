package java_pila_ejecucion;

public class Flujo {
	public static void main(String args[]) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch (MiException me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio metodo2");
		// We can create and throw our own exceptions in Java
		throw new MiException("Mi excepcion fue lanzada");
		// Only instances of the type Exception can thrown
	}
}
