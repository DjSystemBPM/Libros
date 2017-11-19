package edu.capitulo.dos;

public class ContinueStatement {
	
	public static void main(String[] args) {
		FIRST_CHAR_LOOP : for (int numero = 1; numero <= 4; numero++) {
			for (char letra = 'a'; letra <= 'e'; letra++) {
				if (numero == 4 || letra == 'c') {
					continue FIRST_CHAR_LOOP;
				}
				System.out.println(">>> " + numero + letra);
			}
		}
	}

}
