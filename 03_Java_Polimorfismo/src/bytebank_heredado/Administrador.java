package bytebank_heredado;

public class Administrador extends FuncionarioAutenticable {
	@Override
	public double getBonificacion() {
		return 100;
	}
}
