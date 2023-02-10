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
		
		// Other numeric data types
		// Letters in the end of long and float values are mandatory  
		long numeroGrande = 1222222222222222222L; // lowercased L (l) in the end is also allowed
		short numeroPequenio = 13555;
		byte numeroAunMasPequenio = 15;
		float numeroDecimalPequenio = 2.5F; // lowercased F (f) in the end is also allowed
		
		// Chars
		// Must use single quotes for char values
		// Empty char ('') isn't allowed
		// Only one character is allowed
		/* Numbers are allowed (but are casted into the chars with the corresponding ASCII code)
		 */ 
		char caracter = 'a';
		System.out.println(caracter);
		caracter = 61;
		System.out.println(caracter);
		caracter = 61 + 2; // Addition is executed before casting the value
		// If (char) is omitted, Java can't concatenate chars with numbers and cast them into chars.  
		// If caracter + 1 is not wrapped in parenthesis, caracter is taken as a char, whereas 1 is a 
		// numeric data type, which can't be casted into a char.
		char nuevoCaracter = (char) (caracter + 1);
		System.out.println(nuevoCaracter);
		
		// Strings
		// In Java, they're not primitive types, but objects
		// Must be wrapped in double quotes
		String frase = "Alura cursos en línea";
		System.out.println(frase);
		
		// Arithmetic Operators
		// Addition/Concatenation (+) 
		edad = 46 + 88;
		System.out.println("Mi edad es " + edad);
		
		// Division (/)
		double tercioDouble = 1250.0 / 3;
		int tercioInt = 1250 / 3;
		System.out.println("Un tercio (double) de 1250 es " + tercioDouble);
		System.out.println("Un tercio (int) de 1250 es " + tercioInt);
		
		// Cast data types
		// Conversion
		double datoDouble = 230.89;
		int castInt = (int) datoDouble;
		// Coercion
		int mitadInt = 1251 / 2;
	}
}
