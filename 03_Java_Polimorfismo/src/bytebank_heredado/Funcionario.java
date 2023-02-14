package bytebank_heredado;

// Abstract classes can't be instantiated
// Instances of this data type must be 
// instances of a non-abstract subclass
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;

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

	public double getBonificacion() {
		return this.salario * 0.1;
	}
}
