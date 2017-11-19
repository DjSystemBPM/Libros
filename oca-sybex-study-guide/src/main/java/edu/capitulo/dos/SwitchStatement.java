package edu.capitulo.dos;

public class SwitchStatement {
	/**
	 * TIPOS DE DATOS SOPORTADOS
	 * 
	 * byte and Byte short and Short char and Character int and Integer String
	 * enum values
	 */

	public static void main(String[] args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 6:
			System.out.println("Sunday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Weekday");
			break;
		}
	}

}
