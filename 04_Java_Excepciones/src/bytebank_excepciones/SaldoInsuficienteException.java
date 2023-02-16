package bytebank_excepciones;

// It's good practice to append "Exception" to the name of our
// own subclasses of Exception 
public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
