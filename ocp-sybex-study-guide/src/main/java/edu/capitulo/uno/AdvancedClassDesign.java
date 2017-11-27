package edu.capitulo.uno;

public class AdvancedClassDesign {

	public static void main(String[] args) {
		AdvancedClassDesign inst = new AdvancedClassDesign();
		inst.metodoInstanceOf();
	}
	
	public void metodoInstanceOf(){
		String s = "Hello";
	    if (s instanceof java.lang.String) {
	      System.out.println("is a String");
	    }
	}
	
	
}
