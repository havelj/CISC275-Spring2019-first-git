public class Animal {
	String name;
	int numLegs;
	
	
	public Animal (String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public int getLegs() {
		return numLegs;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ". Number of legs: " + numLegs;
	}
	
}