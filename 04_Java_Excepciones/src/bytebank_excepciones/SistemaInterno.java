package bytebank_excepciones;

public class SistemaInterno {
	private String clave = "12345";

	public boolean autenticar(Autenticable usuario) {
		boolean puedeIniciarSesion = usuario.iniciarSesion(clave);

		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
