package edu.capitulo.dos;

public class TernaryOperator {

	public static void main(String[] args) {
		int y = 10;
		int x = (y > 5) ? (2 * y) : (3 * y);
		System.out.println(x);
		
		int y2 = 1;
		int z2 = 1;
		final int x2  = y2 >= 10 ? y++ : z2++;
		System.out.println(y2+","+z2 + " VALOR DE X2: " + x2);
	}

}
