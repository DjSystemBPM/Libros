package com.alfcueba.uno;

public class BloqueInicializacion {

	private String name = "Fluffy";
	
	{System.out.println("Setting Field");}
	
	public BloqueInicializacion(){
		name = "Tiny";
		System.out.println("Setting Constructor");
	}
	
	public static void main(String[] args) {
		BloqueInicializacion bloque = new BloqueInicializacion();
		System.out.println(bloque.name);
	}
}
