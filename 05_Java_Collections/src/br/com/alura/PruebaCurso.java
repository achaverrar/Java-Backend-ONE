package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP", 30);
		Curso curso2 = new Curso("Ruby", 10);
		Curso curso3 = new Curso("JavaScript", 20);
		Curso curso4 = new Curso("Java", 50);

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
		
		// Order by nombre
		// Increasing order
		Collections.sort(cursos);
		System.out.println(cursos);

		// Decreasing order
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
	}
}
