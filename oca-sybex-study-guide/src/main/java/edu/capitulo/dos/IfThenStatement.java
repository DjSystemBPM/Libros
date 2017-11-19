package edu.capitulo.dos;

import java.util.Calendar;

public class IfThenStatement {

	public static void main(String[] args) {
		String actual = "18:01:23";
		String limit = "18:01:23";

		String[] parts = actual.split(":");
		Calendar actualCal1 = Calendar.getInstance();
		actualCal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
		actualCal1.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
		actualCal1.set(Calendar.SECOND, Integer.parseInt(parts[2]));

		parts = limit.split(":");
		Calendar limitCal2 = Calendar.getInstance();
		limitCal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(parts[0]));
		limitCal2.set(Calendar.MINUTE, Integer.parseInt(parts[1]));
		limitCal2.set(Calendar.SECOND, Integer.parseInt(parts[2]));

		// Add 1 day because you mean 00:16:23 the next day
		//DESCOMENTAR PARA AGREGAR UN DIA A LA HORA: limitCal2.add(Calendar.DATE, 1);

		if (actualCal1.before(limitCal2)) {
		    System.out.println("Actual es mas temprano");
		} else if (actualCal1.after(limitCal2)) {
			System.out.println("Actual es mas tarde");
		} else {
			System.out.println("Es la hora exacta");
		}
	}

}
