package javasessions;

public class NestedLoops {

	public static void main(String[] args) {

		// 00 01 02 03 04 05
		// ------------------
		// 10 11 12 13 14 15
		// ------------------
		// 20 21 22 23 24 25
		// ------------------
		// 30
		// 40
		// 50 51 52 53 54 55
		// 99
		// ------------------

		// outer loop
		for (int i = 0; i <= 9; i++) {

			// inner loop:
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + " ");// 00 01 02 03 04 05 10 11 12

			}

			System.out.println();
			System.out.println("------------------------------");
		}

	}

}
