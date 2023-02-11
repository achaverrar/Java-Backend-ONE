package proyecto_bytebank;

public class PruebaMetodos {

	public static void main(String[] args) {

		// Testing depositar()
		Cuenta cuentaA = new Cuenta();
		System.out.println(cuentaA.saldo);
		// Change attribute values directly
		cuentaA.saldo = 300;
		System.out.println(cuentaA.saldo);
		// Use methods to change attribute values
		cuentaA.depositar(200);
		System.out.println("El nuevo saldo es: " + cuentaA.saldo);
		
		// Testing retirar()
		// Case 1: success at operation
		boolean retiroExitoso = cuentaA.retirar(100);
		if(retiroExitoso) {
			System.out.println("El retiro fue exitoso.");
			System.out.println("La cuenta A tiene un saldo de " + cuentaA.saldo);
		} else {
			System.out.println("No se pudo efectuar el retiro");
		}
		
		// Case 2: failure at operation
		retiroExitoso = cuentaA.retirar(600);
		if(retiroExitoso) {
			System.out.println("El retiro fue exitoso.");
			System.out.println("La cuenta A tiene un saldo de " + cuentaA.saldo);
		} else {
			System.out.println("No se pudo efectuar el retiro");
		}
		
		// Testing transferir()
		// Setting up a new account for this test
		Cuenta cuentaB = new Cuenta();
		cuentaB.depositar(1000);
		System.out.println("La cuenta B tiene un saldo de " + cuentaB.saldo);
		
		// Case 1: success at operation
		boolean transferenciaExitosa = cuentaB.transferir(400, cuentaA);
		if (transferenciaExitosa) {
			System.out.println("La transferencia fue exitosa.");
			System.out.println("La cuenta B tiene un saldo de " + cuentaB.saldo);
			System.out.println("La cuenta A tiene un saldo de " + cuentaA.saldo);
		} else {
			System.out.println("No se pudo efectuar la transferencia.");			
		}
	}

}
