package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, -8000, 5 };

		int max = 0;
		int minIndex = 0;

		max = numbers[0];

		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Mininmum Index: " + minIndex);
	}

}
