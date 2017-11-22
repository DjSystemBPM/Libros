package edu.capitulo.cuatro;

import java.util.ArrayList;
import java.util.List;

public class LambdaSimpleClass {
	public static void main(String[] args) {
		LambdaSimpleClass inst = new LambdaSimpleClass();
		inst.metodoLambdaParametros();
	}
	
	public void metodoLambdaParametros(){
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
	}

}
