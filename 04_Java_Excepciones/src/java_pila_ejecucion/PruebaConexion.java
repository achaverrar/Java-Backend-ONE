package java_pila_ejecucion;

public class PruebaConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		try {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
		} 
		// The keyword finally is optional as long as 
		// there's a catch block in the try-catch statement
		//
		// finally doesn't handle exceptions and its body
		// is executed regardless of the exception being 
		// caught or not.
		//
		// There can only be a single finally block per
		// try-catch statement and it must be the last
		// block in the statement
		finally {
			System.out.println("Ejecutando finally");
			con.cerrar();			
		}
	}
}
