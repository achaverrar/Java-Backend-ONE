package bytebank_excepciones;

public class ControlBonificacion {
	private double suma;

	public double registrarSalario(Funcionario funcionario) {
		this.suma += funcionario.getBonificacion();
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
