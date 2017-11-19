package edu.capitulo.uno;

public class LogicalOperators {

	public static void main(String[] args) {
		int x = 6;
		boolean and = (x >= 6) && (--x <= 7);
		boolean inclusive = (x >= 6) || (++x <= 7);
		System.out.println(" X  ES IGUAL A: " +  x );
		System.out.println("AND ES IGUAL A: " + and);
		System.out.println("INCLUSIVE ES IGUAL A: " + inclusive);
	}
}
