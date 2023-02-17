package java_pila_ejecucion;

public class Conexion implements AutoCloseable {
	public Conexion() {
		System.out.println("Abriendo conexion");
		throw new IllegalStateException();
	}

	public void leerDatos() {
		System.out.println("Recibiendo datos");
	}

	public void cerrar() {
		System.out.println("Cerrando conexion");
	}
	
	// This method is part of the AutoCloseable interface
	// and so it must be overridden
	// Throwing the Exception is mandatory in the signature
	// due to the original implementation of close()
	@Override
	public void close() throws Exception {
		this.cerrar();
	}
}
