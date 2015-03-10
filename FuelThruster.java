import java.util.Scanner;

/**
 * Tracks how many fuel units the user has burned.
 * 
 * @author Zachary Haloski.
 */
public class FuelThruster {

	// TODO: Implement and write javadoc comments for this class
	// according to the written spec so that it passes the tests
	// in FuelThrusterTest.java

	int limit;
	String destination;
	int currentFuel = 0;

	/**
	 * Constructions a FuelThruster object within the class structure.
	 * 
	 * @param destination
	 * @param limit
	 */
	public FuelThruster(String destination, int limit) {
		this.destination = destination;
		this.limit = limit;
		this.currentFuel = limit;
		/*
		 * System.out.println(this.destination); System.out.println(this.limit);
		 * System.out.println(this.currentFuel);
		 */
	}

	/**
	 * Takes the fuel limit minus the currentFuel level and returns it.
	 * 
	 * @return
	 */
	public int getTotalUnitsBurned() {
		return (this.limit - this.currentFuel);
	}

	/**
	 * Returns the limit on the amount of fuel a given FuelThruster can use.
	 * 
	 * @return this.limit
	 */
	public int getLimit() {
		return this.limit;
	}

	@Override
	public String toString() {
		String temp = new String();
		temp = ("You have burned " + (this.limit - this.currentFuel)
				+ " fuel units of the " + this.limit + " units allowed "
				+ "to the destination " + this.destination);
		return temp;
	}

	/**
	 * Returns either true or false depending on if it is sent parameters that meet the class
	 * requirements.
	 * 
	 * @return true or false (condintional)
	 */
	public Boolean attemptToBurn(int numUnits) {
		if (this.currentFuel - numUnits >= 0 && numUnits > 0) {
			this.currentFuel = this.currentFuel - numUnits;
			System.out.println("Fuel units burned successfully!");
			return true;
		} else {
			return false;
		}
	}
}
