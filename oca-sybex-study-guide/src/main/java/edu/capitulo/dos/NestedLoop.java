package edu.capitulo.dos;

public class NestedLoop {

	public static void main(String[] args) {

		int[][] myComplexArray = {{1234},{4567},{8910}};
		
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i]+"\t");
			}
		}
		
		
		int x = 20;
		while(x>0){
			do{
				x -= 2;
			} while(x > 5);
			x--;
			System.out.println(x + "\t");
		}
	}

}
