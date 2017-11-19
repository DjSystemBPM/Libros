package edu.capitulo.dos;

public class ForStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		//adding multiple terms
		System.out.println();
		
		for (long y = 0,z = 4; y < 5 &&  z < 10; y++,z++) {
			System.out.print(y + " " );
		}
		
	}
}
