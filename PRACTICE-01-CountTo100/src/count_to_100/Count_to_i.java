package count_to_100;

import java.util.Scanner;

public class Count_to_i {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("What is the number you want to count to?: ");
		int num=input.nextInt();
		int[] count = new int[num];
		int i;
		
		for (i=0; i<=count.length; i++) {
			count[i] = i + 1;
			System.out.println(count[i]);
		}

	}

}
