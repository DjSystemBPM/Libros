package edu.capitulo.seis;

public class ExceptionClass {

	public static void main(String[] args) {
		ExceptionClass inst = new ExceptionClass();
		inst.explore();
	}
	
	void explore() {
		try {
			seeAnimals();
			fall();
			System.out.println("Nunca pasa por aqui");
		} catch (RuntimeException e) {
			getUp();
		} finally {
			seeMoreAnimals();
		}
		
	}
	
	private void seeMoreAnimals() {
		System.out.println("Mas animales finalmente!");
		
	}

	private void seeAnimals() {
		System.out.println("Hola animal!");
		
	}

	private void getUp() {
		System.out.println("Hola Catch!");
		
	}

	void fall() {
		throw new RuntimeException();
	}
	
	

}
