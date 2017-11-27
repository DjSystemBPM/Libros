package edu.capitulo.uno;

public class EqualsToStringClass {

	private String name;
	private double weight;

	private int idNumber;
	private int age;

	public EqualsToStringClass(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	

	public EqualsToStringClass(String name, int idNumber, int age) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.age = age;
	}


	/**
	 * Ejemplo de toString
	 */
	@Override
	public String toString() {
		return "EqualsHashcodeToStringClass [name=" + name + ", weight=" + weight + "]";
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + idNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof EqualsToStringClass)) return false;
		EqualsToStringClass otherLion = (EqualsToStringClass) obj;
		return this.idNumber == otherLion.idNumber;
	}


	public static void main(String[] args) {
		EqualsToStringClass h1 = new EqualsToStringClass("Harry", 3100);
		System.out.println(h1);
	}
}
