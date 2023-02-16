package java_pila_ejecucion;

public class PruebaConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		try {
			con.leerDatos();
			con.cerrar();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepcion");
			ex.printStackTrace();
			con.cerrar();
		}
	}
}
