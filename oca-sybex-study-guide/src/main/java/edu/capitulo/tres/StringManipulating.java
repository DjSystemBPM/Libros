package edu.capitulo.tres;

public class StringManipulating {

	public static void main(String[] args) {
		StringManipulating inst = new StringManipulating();
		inst.crearString();
		inst.concatenacion();
		inst.metodoLength();
		inst.metodoCharAt();
		inst.metodoIndexOf();
		inst.metodoSubstring();
		inst.metodoLowerUpperCase();
		inst.metodoEqualsEqualsIgnoreCase();
		inst.metodoStartEndWith();
		inst.metodoContains();
		inst.metodoReplace();
		inst.metodoTrim();
	}

	/**
	 * Metodo que muestra como crear un String
	 */
	public void crearString() {
		String name = "Alfredo";
		String lastName = new String("Cuevas");
		System.out.println(name + " " + lastName);
	}

	/**
	 * Metodo que muestra como concatenar un String
	 */
	public void concatenacion() {
		String s = "1";
		s += "2";
		s += "3";
		System.out.println(1 + 2 + "a" + "b" + 8 + "c" + s);
	}

	/**
	 * Metodo que muestra el uso del metodo legth para medir la longitud de la
	 * cadena
	 */
	public void metodoLength() {
		String animal = "tiger";
		System.out.println(animal.length());
	}

	/**
	 * Metodo que muestra como utilizar el metodo charAt que sirve para extraer
	 * un caracter del String, si indicamos un numero fuera del arreglo arrojara
	 * una excepcion StringIndexOutOfBoundsException.
	 */
	public void metodoCharAt() {
		String animal = "tiger";
		System.out.println(animal.charAt(0) + " y " + animal.charAt(4));
	}

	/**
	 * Metodo que permite encontrar el primer index que coincide con el que
	 * estas buscando, si no encuentra el index arroja un -1.
	 */
	public void metodoIndexOf() {
		String animal = "tiger";
		String animal2 = "anaconda";
		System.out.print(animal.indexOf("er"));
		System.out.print("\t" + animal2.indexOf('a', 2));
	}

	/**
	 * Metodo que muestra el uso de substring el cual sirve para sustraer un
	 * pedazo del string desde y hasta donde le digamos
	 */
	public void metodoSubstring() {
		String animal = "tiger";
		System.out.print("\n" + animal.substring(2));
		System.out.print("\t" + animal.substring(animal.indexOf('t'), 2));
	}

	/**
	 * Metodo que permite convertir a Mayusculas o Minusculas un String
	 */
	public void metodoLowerUpperCase() {
		System.out.println("\n>>>>> INICIA metodoLowerUpperCase");
		String animal = "tiger";
		System.out.print("\n" + animal.toUpperCase());
		System.out.print("\t" + "LION".toLowerCase());
		System.out.println("<<<<< TERMINA metodoLowerUpperCase");
	}

	/**
	 * Metodo que permite comparar el contenido de dos String
	 */
	public void metodoEqualsEqualsIgnoreCase() {
		System.out.println("\n>>>>> INICIA metodoEqualsEqualsIgnoreCase");
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		System.out.println("<<<<< TERMINA metodoEqualsEqualsIgnoreCase");
	}

	/**
	 * Metodo que permite verificar si un String inicia o termina con ciertas
	 * letras
	 */
	public void metodoStartEndWith() {
		System.out.println("\n>>>>> INICIA metodoStartEndWith");
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("bc")); // true
		System.out.println("abc".endsWith("a")); // false
		System.out.println("<<<<< TERMINA metodoStartEndWith");
	}

	/**
	 * Metodo que permite verificar si un String contiene cierto caracter
	 */
	public void metodoContains() {
		System.out.println("\n>>>>> INICIA metodoContains");
		System.out.println("abc".contains("b")); // true
		System.out.println("ABC".equals("Z")); // false
		System.out.println("abc".equalsIgnoreCase("B")); // false
		System.out.println("<<<<< TERMINA metodoContains");
	}
	
	/**
	 * Metodo que permite remplazar una cadena vieja por una nueva
	 */
	public void metodoReplace(){
		System.out.println("\n>>>>> INICIA metodoReplace");
		System.out.println("abcabc".replace('b','B')); 
		System.out.println("DFGABCDFG".replace("DFG", "123"));
		System.out.println("abcdfgab".replaceAll("ab", "12")); //Remplaza todo lo que coincida
		System.out.println("ABCABC".replaceFirst("A", "Z")); //Remplaza la primera coincidencia
		System.out.println("<<<<< TERMINA metodoReplace");
	}
	
	/**
	 * Metodo que remueve espacios en blanco o saltos de linea al inicio y al final del String
	 */
	public void metodoTrim(){
		System.out.println("\n>>>>> INICIA metodoTrim");
		System.out.println("abc".trim()); //abc
		System.out.println("\t     a b c\n".trim()); //a b c
		System.out.println("<<<<< TERMINA metodoTrim");
	}
}
