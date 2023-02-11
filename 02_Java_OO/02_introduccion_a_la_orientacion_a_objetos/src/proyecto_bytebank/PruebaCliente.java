package proyecto_bytebank;

public class PruebaCliente {

	public static void main(String[] args) {
		// Setting up a client
		Cliente cliente = new Cliente();
		cliente.nombre = "Ayxa";
		cliente.documento = "444455555";
		cliente.telefono = "3123456789";
		
		// Setting up their account
		Cuenta cuentaDeCliente = new Cuenta();
		cuentaDeCliente.agencia = 1;
		cuentaDeCliente.saldo = 1000.0;
		
		// Creating a link between both instances 
		// (cliente and cuentaDeCliente) 
		cuentaDeCliente.titular = cliente;
		
		// Accessing cliente data via cuentaDeCliente
		System.out.println(cuentaDeCliente.titular.nombre);
		
		// Both point to the same space in memory 
		System.out.println(cuentaDeCliente.titular);
		System.out.println(cliente);

	}

}