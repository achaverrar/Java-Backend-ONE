package bytebank_excepciones;

public class PruebaSistema {
	public static void main(String[] args) {
		Administrador administrador = new Administrador();
		administrador.setClave("11111");

		Gerente gerente = new Gerente();
		gerente.setClave("12345");

		Cliente cliente = new Cliente();
		cliente.setClave("12346");

		SistemaInterno si = new SistemaInterno();
		si.autenticar(administrador);
		si.autenticar(gerente);
		si.autenticar(cliente);
	}
}
