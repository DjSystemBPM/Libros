package edu.capitulo.uno;

public class CreatingNestedInterfaces {

	private interface Secret {
		public void shh();
	}

	class DontTell implements Secret {

		public void shh() {
			System.out.println("Shhh silence!");

		}

	}
}
