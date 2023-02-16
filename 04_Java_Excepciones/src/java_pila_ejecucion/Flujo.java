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

	// Checked exceptions MUST be handled at some point of 
	// their execution stack for compilation to happen
	//
	// If a method is not going to handle the checked exception
	// it must (use the keyword throws) to re-throw the exception 
	// to the next method in the stack one of them handles it 
	private static void metodo2() throws MiException {
		System.out.println("Inicio metodo2");
		throw new MiException("Mi excepcion fue lanzada");
	}
}
