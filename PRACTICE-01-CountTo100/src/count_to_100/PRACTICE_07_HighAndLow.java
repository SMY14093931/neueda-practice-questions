package count_to_100;

import java.util.Arrays;
import java.util.Scanner;

public class PRACTICE_07_HighAndLow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e, f, g;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		f=input.nextInt();
		g=input.nextInt();
		int [] test = {a,b,c,d,e,f,g};
		
		int min = Arrays.stream(test).min().getAsInt();
        int max = Arrays.stream(test).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


	}

}
