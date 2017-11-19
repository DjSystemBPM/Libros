package edu.capitulo.tres;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilderClass inst = new StringBuilderClass();
		inst.metodoStringSimple();
		inst.metodoStringBuilder();
		inst.metodoAppend();
		inst.metodoInsert();
		inst.metodoDeleteDeleteCharAt();
		inst.metodoReverse();
	}

	/**
	 * Metodo que permite pequeños objetos de tipo String lo hace mas facil de
	 * manejar un String pequeño.
	 */
	public void metodoStringSimple() {
		System.out.println("\n>>>>> INICIA metodoStringSimple");
		String alpha = "";
		for (char abecedario = 'a'; abecedario <= 'z'; abecedario++) {
			alpha += abecedario;
		}
		System.out.println(alpha);
		System.out.println("<<<<< TERMINA metodoStringSimple");
	}

	/**
	 * Metodo que permite manejar String mucho mas largos y estos son los
	 * principales metodos utilizados en el StringBuilder: Substring Length
	 * CharAt
	 */
	public void metodoStringBuilder() {
		System.out.println("\n>>>>> INICIA metodoStringBuilder");
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + "\t" + len + "\t" + ch);

		System.out.println("<<<<< TERMINA metodoStringBuilder");
	}

	/**
	 * Con el metodo append nos permite agregar mas partes al String que estamos
	 * construyendo.
	 */
	public void metodoAppend() {
		System.out.println("\n>>>>> INICIA metodoAppend");
		StringBuilder sb = new StringBuilder("Hola").append(" Mundo ").append("Alfredo");
		sb.append("!.");
		System.out.println(sb);
		System.out.println("<<<<< TERMINA metodoAppend");
	}

	/**
	 * Nos permite insertar dentro del String definido otros pedazos de String
	 * en el mismo objeto.
	 */
	public void metodoInsert() {
		System.out.println("\n>>>>> INICIA metodoInsert");
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-");
		System.out.println(sb);
		sb.insert(0, "-");
		System.out.println(sb);
		sb.insert(4, "-");
		System.out.println(sb);
		System.out.println("<<<<< TERMINA metodoInsert");
	}

	/**
	 * Es el metodo opuesto al de insert() ya que elimina pedazos de String en
	 * el mismo objeto.
	 */
	public void metodoDeleteDeleteCharAt() {
		System.out.println("\n>>>>> INICIA metodoDeleteDeleteCharAt");
		StringBuilder sb = new StringBuilder("abcdefg");
		sb.delete(1, 4);
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		System.out.println("<<<<< TERMINA metodoDeleteDeleteCharAt");
	}

	/**
	 * Este metodo invierte la direccion de los caracteres del String.
	 */
	public void metodoReverse() {
		System.out.println("\n>>>>> INICIA metodoReverse");
		StringBuilder sb = new StringBuilder("ABCD");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println("<<<<< TERMINA metodoReverse");
	}
}
