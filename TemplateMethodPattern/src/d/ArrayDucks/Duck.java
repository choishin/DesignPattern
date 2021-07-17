package d.ArrayDucks;

public class Duck implements Comparable {
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", Weight=" + weight + "]";
	}

	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck)object;
		
		if (this.weight <otherDuck.weight) {
			return -1;
		}
		else if (this.weight == otherDuck.weight) {
			return 0;
		}
		else {
			return 1;
		}
	}

}
