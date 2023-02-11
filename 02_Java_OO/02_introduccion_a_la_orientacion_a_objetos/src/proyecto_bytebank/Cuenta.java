package proyecto_bytebank;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// Void methods don't return anything
	// methods' names should follow lower-camel case naming convention
	public void depositar(double valor) {
		// The this keyword is an optional reference that helps avoid 
		// name collisions between attributes and other kinds of variables 
		this.saldo += valor;
	}
}
