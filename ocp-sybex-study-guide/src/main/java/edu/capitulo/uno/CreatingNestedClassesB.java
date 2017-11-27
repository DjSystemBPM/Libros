package edu.capitulo.uno;

public class CreatingNestedClassesB {
	private int length = 5;

	public void calculate() {

		final int width = 20;

		class Inner {
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		CreatingNestedClassesB outer = new CreatingNestedClassesB();
		outer.calculate();
	}
	
}
