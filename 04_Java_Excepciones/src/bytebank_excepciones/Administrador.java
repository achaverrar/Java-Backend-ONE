package bytebank_excepciones;

// The superclass must be declared before the interface(s)
// A class CAN implement multiple interfaces but extend AT MOST a class
public class Administrador extends Funcionario implements Autenticable {
	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public double getBonificacion() {
		return 100;
	}
}
