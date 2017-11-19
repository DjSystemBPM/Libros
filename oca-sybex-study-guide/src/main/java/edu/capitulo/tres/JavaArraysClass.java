package edu.capitulo.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaArraysClass {
	/**
	 * Ejemplo de como declarar un tipo de parametro Array
	 */
	public static void main(String... args) {
		JavaArraysClass inst = new JavaArraysClass();
		inst.metodoArrayReferenceVariable();
		inst.metodoUsingArray();
		inst.metodoSorting();
		inst.metodoSearching();
		inst.metodoArrayMultidimensional();
		inst.metodoArrayList();
		inst.metodoArrayListAdd();
		inst.metodoArrayListRemove();
		inst.metodoArrayListSet();
		inst.metodoArrayListIsEmptySize();
		inst.metodoArrayListClear();
		inst.metodoArrayListContains();
		inst.metodoArrayListEquals();
		inst.metodoArrayListSorting();
	}

	/**
	 * Metodo que declara un array y le asigna el valor de otro array
	 */
	public void metodoArrayReferenceVariable() {
		System.out.println("\n>>>>> INICIA metodoArrayReferenceVariable");
		String[] bugs = { "cricket", "beetle", "lady bug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias));
		System.out.println("<<<<< TERMINA metodoArrayReferenceVariable");
	}

	/**
	 * Metodo para usar un array simple
	 */
	public void metodoUsingArray() {
		System.out.println("\n>>>>> INICIA metodoUsingArray");
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println(mammals.length);
		String[] mammalsClone = mammals.clone();
		System.out.println(mammalsClone[0]);
		System.out.println(mammalsClone[1]);
		System.out.println(mammalsClone[2]);
		for (int i = 0; i < mammalsClone.length; i++) {
			System.out.println(mammalsClone[i]);
		}
		System.out.println("<<<<< TERMINA metodoUsingArray");
	}

	/**
	 * Metodo para ordenar un array
	 */
	public void metodoSorting() {
		System.out.println("\n>>>>> INICIA metodoSorting");
		int[] numbers = { 6, 9, 5, 7, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
		}
		System.out.println();
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String ordenada : strings) {
			System.out.print(ordenada + "\t");
		}
		System.out.println("\n<<<<< TERMINA metodoSorting");
	}

	/**
	 * Metodo para buscar en un array cierto valor
	 */
	public void metodoSearching() {
		System.out.println("\n>>>>> INICIA metodoSearching");
		int[] numbers = { 2, 4, 5, 6, 7, 8, 5, 6, 3 };
		System.out.println(Arrays.binarySearch(numbers, 5));
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 7));
		System.out.println("<<<<< TERMINA metodoSearching");
	}

	/**
	 * Ejemplo de como utilizar un array multidimensional
	 */
	public void metodoArrayMultidimensional() {
		System.out.println("\n>>>>> INICIA metodoArrayMultidimensional");
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + "\t");
			}
			System.out.println();
		}
		// Es lo mismo
		for (int[] inner : twoD) {
			for (int num : inner) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		System.out.println("<<<<< TERMINA metodoArrayMultidimensional");
	}

	/**
	 * Ejemplo de como declarar un ArrayList de diferentes formas
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void metodoArrayList() {
		System.out.println("\n>>>>> INICIA metodoArrayListAddRemove");
		ArrayList list1 = new ArrayList();
		ArrayList<?> list2 = new ArrayList<>(10);
		ArrayList<?> list3 = new ArrayList<>(list2);
		System.out.println(list3);
		List<String> list4 = new ArrayList<>();
		System.out.println(list4);
		list1.add("Hawk");
		list1.add(Boolean.TRUE);
		list1.add(13);
		System.out.println(list1);
		System.out.println("<<<<< TERMINA metodoArrayListAddRemove");
	}

	/**
	 * Metodo de array list que nos permite añadir a la coleccion datos
	 */
	public void metodoArrayListAdd() {
		System.out.println("\n>>>>> INICIA metodoArrayListAdd");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		System.out.println(birds);
		System.out.println("<<<<< TERMINA metodoArrayListAdd");
	}

	/**
	 * Metodo de array list que nos permite remover de la coleccion datos
	 */
	public void metodoArrayListRemove() {
		System.out.println("\n>>>>> INICIA metodoArrayListRemove");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blue jay");
		birds.add(1, "cardinal");
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.remove("cardinal")); // Prints true
		birds.remove("hawk");
		System.out.println(birds.remove(0));// Print blue jay
		System.out.println(birds);
		birds.removeAll(birds);
		System.out.println(birds);
		System.out.println("<<<<< TERMINA metodoArrayListRemove");
	}

	/**
	 * Metodo de array list que nos permite establecer a la coleccion datos en
	 * una posicion especifica del array
	 */
	public void metodoArrayListSet() {
		System.out.println("\n>>>>> INICIA metodoArrayListSet");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.size());
		birds.set(0, "robin");
		System.out.println(birds.size());
		System.out.println("<<<<< TERMINA metodoArrayListSet");
	}

	/**
	 * Metodo de array list que nos permite conocer el tamaño del Array y si esta vacio.
	 */
	public void metodoArrayListIsEmptySize() {
		System.out.println("\n>>>>> INICIA metodoArrayListIsEmptySize");
		List<String> birds = new ArrayList<>();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		System.out.println("<<<<< TERMINA metodoArrayListIsEmptySize");
	}

	/**
	 * Metodo de array list que limpia todo el array
	 */
	public void metodoArrayListClear() {
		System.out.println("\n>>>>> INICIA metodoArrayListClear");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		System.out.println("<<<<< TERMINA metodoArrayListClear");
	}

	/**
	 * Metodo de arraylist que nos permite conocer si el arreglo contiene cierto valor
	 */
	public void metodoArrayListContains() {
		System.out.println("\n>>>>> INICIA metodoArrayListContains");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
		System.out.println("<<<<< TERMINA metodoArrayListContains");
	}

	/**
	 * Metodo de arraylist que compara que sean iguales dos arreglos
	 */
	public void metodoArrayListEquals() {
		System.out.println("\n>>>>> INICIA metodoArrayListEquals");
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));
		one.add("a");
		System.out.println(one.equals(two));
		two.add("a");
		System.out.println(one.equals(two));
		System.out.println("<<<<< TERMINA metodoArrayListEquals");
	}
	
	
	public void metodoArrayListSorting(){
		System.out.println("\n>>>>> INICIA metodoArrayListSorting");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(99);
		numeros.add(5);
		numeros.add(81);
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);
		System.out.println("<<<<< TERMINA metodoArrayListSorting");
	}
}
