package bytebank_heredado;

public class Gerente extends Funcionario {
	private String clave;

	// Gives clave a default value
	public Gerente() {
		this.clave = "AluraCursosOnLine";
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
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
