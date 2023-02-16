package java_pila_ejecucion;

// Classes that extend RuntimeException yield 
// unchecked exceptions (the compiler won't prevent
// execution in case they're not handled)
public class MiException extends RuntimeException{
	public MiException() {
		super();
	}

	public MiException(String message) {
		super(message);
	}
}
