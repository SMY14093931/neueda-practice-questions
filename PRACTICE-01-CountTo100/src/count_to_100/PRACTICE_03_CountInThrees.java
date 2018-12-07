package count_to_100;

import java.util.Scanner;

public class PRACTICE_03_CountInThrees {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("What is the number you want to count to?: ");
		int num=input.nextInt();
		int[] count = new int[num];
		int i;
		
		for (i=2; i<=count.length; i+=3) {
			count[i] = i + 1;
			System.out.println(count[i]);
		}

	}

}
