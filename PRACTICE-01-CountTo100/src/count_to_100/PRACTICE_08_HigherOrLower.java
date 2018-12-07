package count_to_100;

import java.util.Random;
import java.util.Scanner;

public class PRACTICE_08_HigherOrLower {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int number = random.nextInt(100);
	    int guess = -1;
	    while (guess!=number) {
	    	// Prompt the user for their next guess
	         System.out.print("Enter your guess: ");
	         // Read the users guess
	         guess = input.nextInt();
	         if (guess<number) {
	        	 System.out.println("Number is too low.");
	         }
	         else if (guess>number) {
	        	 System.out.println("Number is too high.");
	         } else {
	        	 System.out.println("Correct number");
	         }
	    }
	
	}

	}
