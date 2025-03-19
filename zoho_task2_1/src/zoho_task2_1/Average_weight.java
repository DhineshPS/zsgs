package zoho_task2_1;
import java.util.Scanner;
public class Average_weight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* System.out.print("Number of People : ");
		int numberOfPeople = scanner.nextInt();
		
		double sum = 0;
			
		for(int loop = 0; loop < numberOfPeople; loop++) {
			System.out.print("Enter weight of " + (loop + 1) + " person in (KG): ");
			sum += scanner.nextDouble();
		}
		 */
		double numberOfPeople = 10;

		int personOne = scanner.nextInt();
		int personTwo = scanner.nextInt();
		int personThree = scanner.nextInt();
		int personFour = scanner.nextInt();
		int personFive = scanner.nextInt();
		int personSix = scanner.nextInt();
		int personSeven = scanner.nextInt();
		int personEight = scanner.nextInt();
		int personNine = scanner.nextInt();
		int personTen = scanner.nextInt();

		int sum = personOne + personTwo + personThree + personFour + personFive + personSix + personSeven + personEight + personNine + personTen;

		double avgWeight = sum / numberOfPeople;
		System.out.println("Average Weight of " + numberOfPeople + " person/persons is " + avgWeight + "KG");
		
	}

}
