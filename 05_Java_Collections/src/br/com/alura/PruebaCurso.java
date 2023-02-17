package br.com.alura;

import java.util.ArrayList;

public class PruebaCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Geometria", 30);
		Curso curso2 = new Curso("Fisica", 30);
		Curso curso3 = new Curso("Quimica", 30);
		Curso curso4 = new Curso("Historia", 30);

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		// To print lists to the console, items are
		// converted to Strings using the method toString()
		// which returns the addresses in memory in the case
		// of reference types
		System.out.println(cursos);
	}
}
