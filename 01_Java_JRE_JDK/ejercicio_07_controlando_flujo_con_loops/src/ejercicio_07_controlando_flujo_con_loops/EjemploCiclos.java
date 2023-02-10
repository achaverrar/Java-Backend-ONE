package ejercicio_07_controlando_flujo_con_loops;

public class EjemploCiclos {

	public static void main(String[] args) {
		// While loop

		// Prints all natural numbers from 1 to 10
		int contador = 1;        

        while (contador <= 10) {        
            System.out.println(contador);
            contador++;
        }
        
        // Prints out the sum of all natural numbers from 1 to 10
        contador = 1;        
        int total = 0;
        while (contador <= 10) {
        	total += contador;
        	contador++;
        }
        System.out.println("La suma de todos los n naturales de 1 a 10 es: " + total);
	}

}
