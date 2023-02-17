package java_pila_ejecucion;

public class PruebaConexion {
	public static void main(String[] args) {
		// Initializing an object as null and wrapping its
		// constructor in a try block is common when there's
		// a chance an Exception is thrown while initializing
		// the object. This way, we can handle the exception
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally");
			// This condition prevents getting a NullPointerException
			// in case Conexion() never gets to finish execution
			if (con != null) {
				con.cerrar();
			}
		}
	}
}
