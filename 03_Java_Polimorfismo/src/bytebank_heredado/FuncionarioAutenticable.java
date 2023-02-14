package bytebank_heredado;

public abstract class FuncionarioAutenticable extends Funcionario {
	private String clave;

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
}
