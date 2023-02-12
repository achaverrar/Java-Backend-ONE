package bytebank_heredado;

public class PruebaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNombre("Ayxa");
		gerente.setSalario(5000);

		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
	}
}
