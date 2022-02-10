import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfCases = in.nextInt();
		double[] farenheits = new double[numberOfCases];
		// get all initial temperatures
		for (int i = 0; i < farenheits.length; i++) {
			farenheits[i] = in.nextDouble();
		}
		
		// print out all new temperatures
		for (int i = 0; i < farenheits.length; i++) {
			double farenheight = farenheits[i];
			double kelvin = (5 * (farenheight - 32) / 9) + 273.15;
			System.out.printf("%.1f\n", kelvin);
		}
	}
}
