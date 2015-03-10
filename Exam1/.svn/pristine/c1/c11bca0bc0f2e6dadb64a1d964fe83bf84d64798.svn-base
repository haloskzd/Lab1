import java.util.Scanner;

/**
 * A program that lets the user burn fuel until they quit, 
 * but enforcing the limit on the the number of fuel units they can burn.
 *
 * @author <<<Your name>>>.
 */
public class FuelThrusterMain {

	/**
	 * Tests the FuelThruster class.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalFuel;
		String destination;
		
		System.out.println("Enter the destination: ");
		destination = scanner.nextLine();
		System.out.println("Enter the limit of fuel units: ");
		totalFuel = scanner.nextInt();
		
		FuelThruster forTest = new FuelThruster(destination, totalFuel);
		
		int fuel = 0;
		try{
			while(true){
				System.out.print("How many fuel units to burn (or enter quit)? ");
				fuel = scanner.nextInt();
				forTest.attemptToBurn(fuel);
				System.out.println(forTest.toString());
			}
				}catch(Exception e){
					System.out.print("");
				}
		scanner.close();
		
	}
}