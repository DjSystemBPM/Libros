package edu.capitulo.uno;

public class CreatingNestedClassesA {

	private int x = 10;
	
	class B{
		private int x = 20;
		
		class C {
			private int x = 30;
			
			public void allTheX(){
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(CreatingNestedClassesA.this.x);
			}
		}
	}
	
	public static void main(String[] args) {
		CreatingNestedClassesA a = new CreatingNestedClassesA();
		CreatingNestedClassesA.B b = a.new B();
		CreatingNestedClassesA.B.C c = b.new C();
		
		c.allTheX();
	}
}
