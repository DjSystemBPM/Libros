package edu.capitulo.cinco;

public class BearImpl implements Herbivore, Omnivore{
	
	@Override
	public void eatPlantsEggs() {
		System.out.println("Come Huevo");
		
	}

	@Override
	public int eatPlants(int quantity) {
		System.out.println("Come plantas: " + quantity);
		return 10;
	}
	
}
