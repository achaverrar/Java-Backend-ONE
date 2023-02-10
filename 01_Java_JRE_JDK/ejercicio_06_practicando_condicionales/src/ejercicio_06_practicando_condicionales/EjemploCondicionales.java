package ejercicio_06_practicando_condicionales;

public class EjemploCondicionales {

	public static void main(String[] args) {
		// Conditionals
		int edad = 17;
		int cantidadPersonas = 2;

		boolean esAdulto = edad >= 18;
		boolean vieneAcompaniado = cantidadPersonas > 1;
		if (esAdulto || vieneAcompaniado) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permiso" + " de ingreso");

		}

		/*
		 * If statements without curly braces are allowed 
		 * Logic depends on indentation
		 */
		if (edad >= 18)
			System.out.println("Dentro del cuerpo del if (sin llaves)");
		System.out.println("Fuera del if (sin llaves)");
		
		// Switch statements
		int mes = 13;

        switch (mes) {
            case 1:
                System.out.println ("El mes es enero");
                break;
            case 2:
                System.out.println ("El mes es febrero");
                break;
            case 3:
                System.out.println ("El mes es marzo");
                break;
            case 4:
                System.out.println ("El mes es abril");
                break;
            case 5:
                System.out.println ("El mes es mayo");
                break;
            case 6:
                System.out.println ("El mes es junio");
                break;
            case 7:
                System.out.println ("El mes es julio");
                break;
            case 8:
                System.out.println ("El mes es agosto");
                break;
            case 9:
                System.out.println ("El mes es septiembre");
                break;
            case 10:
                System.out.println ("El mes es octubre");
                break;
            case 11:
                System.out.println ("El mes es noviembre");
                break;
            case 12:
                System.out.println ("El mes es diciembre");
                break;
            default:
                System.out.println ("Mes inválido");
                break;
        }
	}

}
