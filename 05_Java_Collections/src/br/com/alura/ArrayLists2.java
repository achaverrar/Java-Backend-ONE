package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLists2 {

	public static void main(String[] args) {
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";

		ArrayList<String> cursos = new ArrayList<>();

		// Sorting arrays
		// Original order
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		System.out.println(cursos);

		// Using Collections
		// Increasing order
		Collections.sort(cursos);
		System.out.println(cursos);

		// Decreasing order
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);

		// Using Comparators
		// Increasing order
		cursos.sort(Comparator.naturalOrder());
		System.out.println(cursos);

		// Decreasing order
		cursos.sort(Comparator.reverseOrder());
		System.out.println(cursos);

		// Stream (Java 8+)
		// Increasing order
		// This method doesn't mutate the original ArrayList
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
		
		// Decreasing order
		List<String> cursosListDec = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(cursosListDec);
	}
}
