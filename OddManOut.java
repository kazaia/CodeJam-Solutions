import java.util.Scanner;

class OddManOut {
	public static int oddManOut(int[] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++)
			n ^= arr[i];
		return n;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int[][] guests = new int[testCases][];

		for (int i = 0; i < testCases; i++) {
			int howManyGuests = scan.nextInt();
			guests[i] = new int[howManyGuests];
			for (int j = 0; j < howManyGuests; j++) {
				guests[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < testCases; i++) {
			System.out.println("Case #" + (i+1) + ": " +oddManOut(guests[i]));
		}
	}
}
