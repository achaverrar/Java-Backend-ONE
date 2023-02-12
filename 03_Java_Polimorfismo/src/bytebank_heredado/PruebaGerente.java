package bytebank_heredado;

public class PruebaGerente {
	public static void main(String[] args) {
		//Gerente gerente = new Gerente();
		Funcionario gerente = new Funcionario();
		gerente.setNombre("Ayxa");
		gerente.setSalario(5000);
		gerente.setTipo(1);

		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
	}
}
