package bytebank_heredado;

public class PruebaControlBonificacion {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);

		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
	}
}
