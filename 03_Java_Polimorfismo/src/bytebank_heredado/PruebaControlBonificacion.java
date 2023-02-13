package bytebank_heredado;

public class PruebaControlBonificacion {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);

		Gerente gerente = new Gerente();
		gerente.setSalario(10000);

		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
	}
}
