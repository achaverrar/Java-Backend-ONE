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
	
	// For methods that return something, we must declare the type 
	// of data that will be returned
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}
