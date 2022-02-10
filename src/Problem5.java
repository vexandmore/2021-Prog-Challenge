import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfCases = in.nextInt();
		
		// This array contains all the 6 temp values for a given test case.
		double[][] temperatureData = new double[numberOfCases][6];
		for (int i = 0; i < numberOfCases; i++) {
			// Grab the 6 values for this test case
			double[] testCase = new double[6];
			for (int j = 0; j < 6; j++) {
				testCase[j] = in.nextDouble();
			}
			// and put the test case in the array
			temperatureData[i] = testCase;
		}
		
		for (double[] testCase: temperatureData) {
			printForData(testCase);
		}
	}
	
	private static void printForData(double[] data) {
		double average = calcAverage(data);
		double greatestDelta = greatestDifferenceInData(data);
		if (10 <= average && average <= 30 && Math.abs(greatestDelta) <= 60) {
			System.out.println(average);
		} else {
			System.out.println("danger");
		}
	}
	
	private static double calcAverage(double[] data) {
		double sum = 0.0;
		for (double datum: data) {
			sum += datum;
		}
		return sum / data.length;
	}
	
	private static double greatestDifferenceInData(double[] data) {
		double max = data[0], min = data[0];
		for (double datum: data) {
			if (datum > max) {
				max = datum;
			}
			if (datum < min) {
				min = datum;
			}
		}
		return max - min;
	}

}
