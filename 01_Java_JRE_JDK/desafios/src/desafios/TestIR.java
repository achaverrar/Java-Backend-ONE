package desafios;

public class TestIR {

	public static void main(String[] args) {
		
		// De 1900.0 hasta 2800.0 el IR es de 7.5% y se pueden deducir $ 142
        // De 2800.01 hasta 3751.0 el IR es de de 15% y se pueden deducir $ 350
        // De 3751.01 hasta 4664.00 el IR es de de 22.5% y se pueden deducir $ 636

		double salario = 3300.0, ir = 0, deduccion = 0;

		if (salario >= 1900.0 && salario < 2800.01) {
			ir = 7.5;
			deduccion = 142;
		} else if (salario < 3751.01) {
			ir = 15;
			deduccion = 350;
		} else if (salario < 4664.00) {
			ir = 22.5;
			deduccion = 636;
		}

		System.out.println("Su tasa es de: " + ir + "%");
		System.out.println("Usted puede deducir hasta $" + deduccion);
	}

}
