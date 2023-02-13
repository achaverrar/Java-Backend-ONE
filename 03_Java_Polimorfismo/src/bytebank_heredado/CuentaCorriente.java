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
	
	// @Override allows subclasses overriding methods existing in their
	// corresponding superclass.
	// If this annotation is skipped, there won't be errors if the original
	// method's signature is changed and so, there's a chance the new method
	// doesn't override that of the superclass 
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
}