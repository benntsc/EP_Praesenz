package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		int sum;
		
		//Ausgabe der Matrix bevor Veränderung
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		//Erhöhung jedes Element der Matrix um 1
		for (int j = 0; j <= 2; j++) {
			for (int i = 0; i <= a[j].length - 1; i++) {
				a[j][i]++;
			}
		}
		
		//Summe aller Einträge der Matrix
		sum = 0;
		for (int j = 0; j <= 2; j++) {
			for (int i = 0; i <= a[j].length -1; i++) {
				sum = sum + a[j][i];
			}
		}
		
		//Ausgabe der Matrix nach Veränderung
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[j].length; i++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(sum);
	}

}
