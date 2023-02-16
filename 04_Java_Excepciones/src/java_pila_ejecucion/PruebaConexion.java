package java_pila_ejecucion;

public class PruebaConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		con.leerDatos();
		con.cerrar();
	}
}
