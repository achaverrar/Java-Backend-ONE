package proyecto_bytebank;

public class Cuenta {
	private double saldo;
	int agencia;
	int numero;
	// Attributes that are instances of other classes are set to null by default
	// Initializing them prevents NullPointerException errors when trying to access them
	Cliente titular = new Cliente();

	// Void methods don't return anything
	// methods' names should follow lower-camel case naming convention
	public void depositar(double valor) {
		// The this keyword is an optional reference that helps avoid
		// name collisions between attributes and other kinds of variables
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	// For methods that return something, we must declare the type
	// of data that will be returned
	public boolean retirar(double valor) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if (valor > 0 && this.saldo >= valor) {
			this.retirar(valor);
			cuentaDestino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
