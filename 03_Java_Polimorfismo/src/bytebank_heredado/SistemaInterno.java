package bytebank_heredado;

public class SistemaInterno {
	private String clave = "12345";

	public boolean autenticar(FuncionarioAutenticable funcionario) {
		boolean puedeIniciarSesion = funcionario.iniciarSesion(clave);

		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
