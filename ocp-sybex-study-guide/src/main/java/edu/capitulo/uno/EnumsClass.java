package edu.capitulo.uno;

enum EnumMain {
	WINTER, SPRING, SUMMER, FALL
}

enum Season {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	private String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}

enum Season2 {
	WINTER {
		public void printHours() {
			System.out.println("9am - 3pm");
		}
	},
	SPRING {
		public void printHours() {
			System.out.println("9am - 5pm");
		}
	},
	SUMMER {
		public void printHours() {
			System.out.println("9am - 7pm");
		}
	},
	FALL {
		public void printHours() {
			System.out.println("9am - 5pm");
		}
	};
	public abstract void printHours();
}

public class EnumsClass {
	public static void main(String[] args) {
		EnumsClass inst = new EnumsClass();
		inst.enumWithWorking();
		inst.enumSwitch();
		Season.WINTER.printExpectedVisitors();
		Season2.SUMMER.printHours();
	}

	public void enumWithWorking() {
		System.out.println(">>>> INICIA METODO enumWithWorking");
		EnumMain s = EnumMain.SUMMER;
		System.out.println(EnumMain.SUMMER);
		System.out.println(s == EnumMain.SUMMER);

		for (EnumMain season : EnumMain.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		s = EnumMain.valueOf("SUMMER");
		System.out.println(s);
		System.out.println(">>>> TERMINA METODO enumWithWorking");
	}

	public void enumSwitch() {
		System.out.println(">>>> INICIA METODO enumSwitch");
		EnumMain summer = EnumMain.SUMMER;
		switch (summer) {
		case WINTER:
			System.out.println("Get out the slet!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!");
			break;
		default:
			System.out.println("Is it summer yet!");
			break;
		}
		System.out.println(">>>> TERMINA METODO enumSwitch");
	}

}