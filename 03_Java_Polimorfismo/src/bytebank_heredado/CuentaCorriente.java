package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	// Constructors aren't inherited
	// If a superclass' only constructors require parameters
	// its subclasses' constructors must require them, too
	// and pass their values as arguments via super()	
	public CuentaCorriente(int agencia, int numero) {
		// super. accesses the superclass' methods and fields
		// super() accesses the superclass' constructor
		super(agencia, numero);
	}
}