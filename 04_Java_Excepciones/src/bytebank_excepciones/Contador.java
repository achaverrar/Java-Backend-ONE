package bytebank_excepciones;

public class Contador extends Funcionario {
	// Abstract methods MUST be overridden/implemented in non-abstract subclasses
	@Override
	public double getBonificacion() {
		return 200.0;
	}
}
