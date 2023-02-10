package ejercicio_04_tipos_y_variables;

public class TipoVariable {
	public static void main(String[] args) {
		// Primitive data types
		// Integers
		int edad = 28;
		System.out.println(edad);
		
		// Doubles
		//// Means "double" amount of bits reserved for this data type than that for integers
		// One can store integer numbers as doubles 
		double salario = 1250.56;
		System.out.println(salario);
		
		// Arithmetic Operators
		// Addition/Concatenation (+) 
		edad = 46 + 88;
		System.out.println("Mi edad es " + edad);
		
		// Division (/)
		double tercioDouble = 1250.0 / 3;
		int tercioInt = 1250 / 3;
		System.out.println("Un tercio (double) de 1250 es " + tercioDouble);
		System.out.println("Un tercio (int) de 1250 es " + tercioInt);		
	}
}
