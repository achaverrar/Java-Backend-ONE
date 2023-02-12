package bytebank_heredado;

public class PruebaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Diego");
		funcionario.setDocumento("444556665");
		funcionario.setSalario(2000);
		funcionario.setTipo(0);
		
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
	}
}
