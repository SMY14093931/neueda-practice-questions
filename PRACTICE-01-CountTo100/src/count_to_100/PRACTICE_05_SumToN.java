package count_to_100;

import java.util.Scanner;

public class PRACTICE_05_SumToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
        int number = input.nextInt();
 
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

	}

}
