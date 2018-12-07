package count_to_100;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PRACTICE_09_ListEnds {

	public static void main(String[] args) {
	
		int[] test = {1,2,3,4,5};
		int[] newArray = {test[0], test[test.length-1]};
		System.out.println(Arrays.toString(newArray));
		

	}

}
