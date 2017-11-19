package edu.capitulo.dos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachStatement {

	public static void main(String[] args) {
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		
		for(String name : names){
			System.out.print(name + ", ");
		}
		
		
		List<String> values = new ArrayList<>();
		values.add("valor1");
		values.add("valor2");
		values.add("valor3");
		
		for(String value : values){
			System.out.print(value + ", ");
		}
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.println(value + ", ");
		}
	}
}
