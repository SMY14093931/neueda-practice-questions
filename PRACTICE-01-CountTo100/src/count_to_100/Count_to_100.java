package count_to_100;

public class Count_to_100 {

	public static void main(String[] args) {
		int[] count = new int[100];
		int i;
		
		for (i=0; i<=count.length; i++) {
			count[i] = i + 1;
			System.out.println(count[i]);
		}

	}

}
