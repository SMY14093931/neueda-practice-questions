package count_to_100;

import java.util.Collections;
import java.util.Scanner;

public class PRACTICE_12_Pyramid {

	public static void main(String[] args) {
		int rows;
		Scanner input = new Scanner(System.in);
		rows=input.nextInt();

        for (int i = 0; i < rows; i++) {

            System.out.println(String.join("", Collections.nCopies(100 - i - 1, " "))
                    + String.join("", Collections.nCopies(2 * i + 1, "*")));

        }

	}

}
