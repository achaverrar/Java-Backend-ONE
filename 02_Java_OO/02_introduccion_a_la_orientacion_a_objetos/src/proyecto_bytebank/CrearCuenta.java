package proyecto_bytebank;

public class CrearCuenta {

	public static void main(String[] args) {
		/*
		 * New instances of a class get default values according to the data type of
		 * each of their class' fields
		 */
		// Data type Default value
		// double -> 0.0
		// int -> 0
		// boolean -> false
		// String -> null
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(200);
		System.out.println(primeraCuenta.getSaldo());

		Cuenta segundaCuenta = new Cuenta(); // creates an independent instance
		segundaCuenta.depositar(50);
		System.out.println(segundaCuenta.getSaldo());

		System.out.println("primera cuenta tiene un saldo de " + primeraCuenta.getSaldo());
		System.out.println("segunda cuenta tiene un saldo de " + segundaCuenta.getSaldo());

		Cuenta terceraCuenta = primeraCuenta; // both variables point to the same object in memory
		terceraCuenta.depositar(50); // this assignment affects both instances
		System.out.println("tercera cuenta tiene un saldo de " + terceraCuenta.getSaldo());
		System.out.println("primera cuenta tiene un saldo de " + primeraCuenta.getSaldo());
		
		if(primeraCuenta == terceraCuenta) {
			System.out.println("La primera y la tercera cuenta son la misma instancia");
		} else {
			System.out.println("La primera y la tercera cuenta son instancias diferentes");			
		}
		
		System.out.println("segunda cuenta tiene un saldo de " + segundaCuenta.getSaldo());
		System.out.println("tercera cuenta tiene un saldo de " + terceraCuenta.getSaldo());
		
		// Having the same values don't make them the same instance
		if(segundaCuenta == terceraCuenta) {
			System.out.println("La segunda y la tercera cuenta son la misma instancia");
		} else {
			System.out.println("La segunda y la tercera cuenta son instancias diferentes");
		}
	}
}
