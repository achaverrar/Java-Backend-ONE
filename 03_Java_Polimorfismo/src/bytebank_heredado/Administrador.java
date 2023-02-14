package bytebank_heredado;

// The superclass must be declared before the interface(s)
// A class CAN implement multiple interfaces but extend AT MOST a class
public class Administrador extends Funcionario implements Autenticable {
	private String clave;

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	@Override
	public double getBonificacion() {
		return 100;
	}
}
