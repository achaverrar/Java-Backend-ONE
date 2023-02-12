package bytebank_heredado;

public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getBonificacion() {
		// tipo 0 --> Funcionario
		// tipo 1 --> Gerente
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return 0.0;
		}
	}
}
