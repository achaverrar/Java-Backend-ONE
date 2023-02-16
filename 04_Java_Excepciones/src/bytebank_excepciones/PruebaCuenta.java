package bytebank_excepciones;

public class PruebaCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorro ca = new CuentaAhorro(2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
		// Prueba el caso en que se intenta retirar 
		// un valor mayor al saldo actual
		ca.retirar(1200);
	}
}
