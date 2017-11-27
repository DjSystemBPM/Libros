package edu.capitulo.uno;

public class HashCodeClass {
	private String rank;
	private String suit;
	
	public HashCodeClass(String r, String s){
		if(r == null || s == null)
			throw new IllegalArgumentException();
		
		rank = r;
		suit = s;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof HashCodeClass)) return false;
		HashCodeClass c = (HashCodeClass)obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
	}

	public int hashCode(){
		return rank.hashCode();
	}
}
