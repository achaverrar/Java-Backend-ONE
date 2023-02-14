package bytebank_heredado;

public class PruebaFuncionario {
	public static void main(String[] args) {
		// Instances of the type Funcionario must be 
		// instances of a non-abstract subclass of
		// Funcionario (i.e. Contador or Gerente)
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		funcionario.setDocumento("444556665");
		funcionario.setSalario(2000);
		
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
	}
}
