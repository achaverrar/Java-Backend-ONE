package bytebank_heredado;

public class Gerente extends Funcionario implements Autenticable {
	private AutenticacionUtil util;

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	// The keyword super grants classes access to private fields and
	// methods from its corresponding superclass
	// Classes can overwrite its superclass' fields and methods if
	// only the value/function body is modified
	@Override
	public double getBonificacion() {
		return super.getSalario() + this.getSalario() * 0.1;
	}
}
