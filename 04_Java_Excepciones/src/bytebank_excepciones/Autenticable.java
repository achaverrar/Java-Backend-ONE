package bytebank_excepciones;

// Interfaces are (implicitly) abstract, so while it's
// allowed to declare them as such, it's also redundant
// (and considered bad practice) to do so
// Interfaces can neither be inherited nor instantiated,
// only implemented
public interface Autenticable {
	// Interfaces can NOT have attributes, since  
	// they're inaccessible to the classes that 
	// implement them 
	//private String clave;

	// All methods in interfaces are (implicitly) abstract
	// so it's redundant (and considered bad practice) to 
	// explicitly label them as such
	public void setClave(String clave);

	public boolean iniciarSesion(String clave);
}
