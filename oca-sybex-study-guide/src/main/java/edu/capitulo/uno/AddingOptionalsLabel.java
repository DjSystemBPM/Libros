package edu.capitulo.uno;

public class AddingOptionalsLabel {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[][] myComplexArray = { { 12345 }, { 67891 }, { 54321 } };

		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
	}
}
