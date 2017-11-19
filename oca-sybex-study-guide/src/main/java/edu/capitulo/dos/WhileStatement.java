package edu.capitulo.dos;

public class WhileStatement {

	public static void main(String[] args) {
		int roomInBelly = 5;
		int bitesOfCheese = 8;
		
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
}
