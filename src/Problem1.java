import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfCases = in.nextInt();
		int[] dividends = new int[numberOfCases];
		int[] divisors = new int[numberOfCases];
		
		for (int i = 0; i < numberOfCases; i++) {
			dividends[i] = in.nextInt();
			divisors[i] = in.nextInt();
		}
		for (int i = 0; i < numberOfCases; i++) {
			int dividend = dividends[i], divisor = divisors[i];
			int result = dividend / divisor;
			int remainder = dividend % divisor;
			if (remainder == 0) {
				System.out.println(result);
			} else {
				System.out.println(dividend / divisor + " remainder " + dividend % divisor);
			}
		}
	}

}
