package br.com.alura;

public class Curso implements Comparable<Curso>{

	private String nombre;
	private int tiempo;

	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return this.tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	// By default toString() returns the address in memory
	// of every instance of the class
	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso curso) {
		return this.nombre.compareTo(curso.getNombre());
	}
}
