package bytebank_heredado;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	// Attributes that are instances of other classes are set to null by default
	// Initializing them prevents NullPointerException errors when trying to access them
	private Cliente titular = new Cliente();
	private static int totalCuentas = 0; 
	
	// Constructors
	// Option 1: receives agencia as parameter
	// Is this were the only constructor, it wouldn't be possible to create an instance 
	// of Cuenta without specifying a value for agencia
	public Cuenta(int agencia) {
		Cuenta.totalCuentas++;
		if(agencia <= 0) {
            System.out.println("Solo se permiten números positivos");
            this.agencia = 1;
        } else {
        	this.agencia = agencia;        	
        }
		System.out.println("Aquí se crea una nueva cuenta");
	}
	
	// Option 2: in case agencia isn't specified, this constructor sets it to 1 by default
	public Cuenta() {
		this(1);
	}
	
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
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalCuentas() {
		return Cuenta.totalCuentas;
	}
}
