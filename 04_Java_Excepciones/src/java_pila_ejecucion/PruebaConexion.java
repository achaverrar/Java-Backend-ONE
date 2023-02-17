package java_pila_ejecucion;

public class PruebaConexion {
	public static void main(String[] args) throws Exception {
		// The try-with-resources is a good choice when there's  
		// a process implementing the AutoCloseable interface 
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
		}
	}
}
