package bytebank_heredado;

public class Gerente extends Funcionario{
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
}
