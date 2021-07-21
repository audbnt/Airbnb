package bonnet.airbnb.outils;


public class Comparaisons<T extends Comparable> {

	private T object1;
	private T object2;

	public Comparaisons(T object1, T object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	public T getHigher() {

		if(object1.getValueToCompare() > object2.getValueToCompare()) {
			return object1;
		}

		return object2;
	}

	public T getLower() {
		return (object1.getValueToCompare() < object2.getValueToCompare()) ? object1 : object2;
	}
}
