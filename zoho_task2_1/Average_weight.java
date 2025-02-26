package zoho_task2_1;
import java.util.Scanner;
public class Average_weight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of People : ");
		int numberOfPeople = scanner.nextInt();
		
		double sum = 0;
			
		for(int loop = 0; loop < numberOfPeople; loop++) {
			System.out.print("Enter weight of " + (loop + 1) + " person in (KG): ");
			sum += scanner.nextDouble();
		}
		scanner.close();

		double avgWeight = sum / numberOfPeople;
		System.out.println("Average Weight of " + numberOfPeople + " person/persons is " + avgWeight + "KG");
		
	}

}
