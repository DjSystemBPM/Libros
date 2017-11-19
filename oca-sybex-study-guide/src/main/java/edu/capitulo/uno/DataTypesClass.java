package edu.capitulo.uno;

public class DataTypesClass {
	
	//Se utilizan los guinoes bajos para una mejor comprension del numero.
	private static int millon = 1_000_000;
	
	public static void main(String[] args) {
		
		DataTypesClass dtc = new DataTypesClass();
		System.out.println(millon);
		dtc.javaPrimitiveTypes();
		dtc.hexadecimalBinario();
		
	}
	
	
	public void javaPrimitiveTypes(){
		//true o false
		boolean booleanTipo = Boolean.TRUE;
		//8 bit integer
		byte byteTipo = Byte.MAX_VALUE;
		//16 bit integer
		short shortTipo = Short.MAX_VALUE;
		//32 bit integer
		int intTipo = Integer.MAX_VALUE;
		//64 bit integer
		long longTipo = Long.MAX_VALUE;
		//32 bit float
		float floatTipo = Float.MAX_VALUE;
		//64 bit float
		double doubleTipo = Double.MAX_VALUE;
		//16 bit unicode
		char charTipo = Character.MAX_VALUE;
		
		System.out.println(booleanTipo);
		System.out.println(byteTipo);
		System.out.println(shortTipo);
		System.out.println(intTipo);
		System.out.println(longTipo);
		System.out.println(floatTipo);
		System.out.println(doubleTipo);
		System.out.println(charTipo);
	}
	
	
	public void hexadecimalBinario(){
		//Hexadecimal y Binario
		System.out.println(56);
		System.out.println(0b11);
		System.out.println(017);
		System.out.println(0x1F);
	}

}
