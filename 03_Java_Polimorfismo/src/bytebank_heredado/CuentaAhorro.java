package bytebank_heredado;

public class CuentaAhorro extends Cuenta {
	public CuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
}
