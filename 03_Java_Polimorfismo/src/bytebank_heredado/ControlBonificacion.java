package bytebank_heredado;

public class ControlBonificacion {
	private double suma;

	public double registrarSalario(Funcionario funcionario) {
		this.suma += funcionario.getBonificacion();
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
