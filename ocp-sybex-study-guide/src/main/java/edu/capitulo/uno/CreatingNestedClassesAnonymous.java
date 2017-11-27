package edu.capitulo.uno;

public class CreatingNestedClassesAnonymous {

	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {

			@Override
			int dollarsOff() {
				return 3;
			}

		};

		return basePrice - sale.dollarsOff();
	}

	public static void main(String[] args) {
		CreatingNestedClassesAnonymous nested = new CreatingNestedClassesAnonymous();
		System.out.println(nested.admission(8));
	}
}

class AnonInner {
	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {

			public int dollarsOff() {
				return 3;
			}

		};

		return basePrice - sale.dollarsOff();
	}

	public static void main(String[] args) {
		AnonInner inst = new AnonInner();
		System.out.println(inst.admission(10));
	}
}

class AnonInnerB {
	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int pay() {
		return admission(5, new SaleTodayOnly() {

			public int dollarsOff() {
				return 3;
			}

		});
	}

	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String[] args) {
		AnonInnerB inst = new AnonInnerB();
		System.out.println(inst.pay());
	}
}
