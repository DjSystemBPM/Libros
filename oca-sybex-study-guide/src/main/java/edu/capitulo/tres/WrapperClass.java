package edu.capitulo.tres;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	public static void main(String[] args) {
		WrapperClass inst = new WrapperClass();
		inst.metodoAutoboxing();
		inst.metodoConvertingBetweenArrayList();
	}

	/**
	 * Autoboxing se refiere a que se hace un casteo de tipo primitivo a su
	 * Wrapper Class automaticamente desde java 5
	 */
	public void metodoAutoboxing() {
		System.out.println("\n>>>>> INICIA metodoAutoboxing");
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60));
		weights.remove(50.5);
		double first = weights.get(0);
		System.out.println(first);
		System.out.println("<<<<< TERMINA metodoAutoboxing");
	}
	
	public void metodoConvertingBetweenArrayList(){
		System.out.println("\n>>>>> INICIA metodoConvertingBetweenArrayList");
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length);
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length);
		System.out.println("<<<<< TERMINA metodoConvertingBetweenArrayList");
		
	}
}
