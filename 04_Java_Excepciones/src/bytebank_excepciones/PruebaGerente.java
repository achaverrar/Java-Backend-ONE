package bytebank_excepciones;

public class PruebaGerente {
	public static void main(String[] args) {
		// Initial set-up
		Gerente gerente = new Gerente();
		gerente.setNombre("Ayxa");

		// Testing getBonification()
		gerente.setSalario(5000);
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());

		// Testing iniciarSesion()
		// Case 1: before setting a customized clave
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));

		// Case 2: after setting a customized clave
		gerente.setClave("ONE");
		System.out.println(gerente.iniciarSesion("ONE"));
	}
}
