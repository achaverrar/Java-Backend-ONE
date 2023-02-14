package bytebank_heredado;

public class Administrador extends Funcionario {
	private String clave;

	public Administrador() {
		this.clave = "AluraCursosOnLine";
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}

	@Override
	public double getBonificacion() {
		return 0;
	}

}
