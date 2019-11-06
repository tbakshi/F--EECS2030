package eecs2030.lab2;

public class Nickel implements Comparable<Nickel> {

	private int year;

	/**
	 * The monetary value of a nickel in cents.
	 */
	public final int CENTS = 5;

	public Nickel(int year) {
		if (year >= 1858) {
			this.year = year;

		} else if (year < 1858) {
			throw new IllegalArgumentException();
		}

	}

	public int compareTo(Nickel other) {

		return this.year - other.year;

	}

	public boolean equals(Object obj) {
		return obj != null && getClass() == obj.getClass();

	}

	public int hascode() {
		return year;
	}

	public int issueYear() {
		return year;
	}

}
