package java_pila_ejecucion;

// Classes that extend Exception yield checked 
// exceptions (the compiler won't allow compilation
// until they're not handled)
public class MiException extends Exception{
	public MiException() {
		super();
	}

	public MiException(String message) {
		super(message);
	}
}
