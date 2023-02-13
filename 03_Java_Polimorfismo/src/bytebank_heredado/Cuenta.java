package bytebank_heredado;

public class Cuenta {
	private double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	private static int totalCuentas = 0;

	// Constructor
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta " + numero);
		Cuenta.totalCuentas++;
	}

	// Other methods
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

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
