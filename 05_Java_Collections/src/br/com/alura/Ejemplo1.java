package br.com.alura;

// This is mandatory to work with ArrayLists
import java.util.ArrayList;

public class Ejemplo1 {

	public static void main(String[] args) {
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";

		// ArrayList<Data type> reference = new ArrayList<>();
		ArrayList<String> lista = new ArrayList<>();

		// Append item to the arrayLists
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);

		// Replace an item for another
		// set(index, value)
		lista.set(2, "Ejemplo Alterado");
		System.out.println(lista);

		// Delete item at given index
		lista.remove(2);
		System.out.println(lista);

		// Get total amount of items
		int size = lista.size();
		System.out.println(size);

		// Append all items from an arrayLists to another
		ArrayList<String> lista2 = new ArrayList<>();
		lista2.addAll(lista);
		System.out.println(lista2);

		// Having the same items isn't enough for
		// two arrayLists to be the same
		System.out.println(lista == lista2);
	}
}
