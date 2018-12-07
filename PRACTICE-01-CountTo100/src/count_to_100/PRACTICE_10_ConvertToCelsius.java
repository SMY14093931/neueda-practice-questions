package count_to_100;

import java.util.Scanner;

public class PRACTICE_10_ConvertToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f1 = input.nextDouble();
		double c = ((double)f1-32)*((double)5/9);
		System.out.println(c);
		

	}

}
