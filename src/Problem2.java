import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfCases = in.nextInt();
		int[] rectangleHeights = new int[numberOfCases];
		int[] triangleHeights = new int[numberOfCases];
		
		for (int i = 0; i < numberOfCases; i++) {
			rectangleHeights[i] = in.nextInt();
			triangleHeights[i] = in.nextInt();
		}
		
		for (int i = 0; i < numberOfCases; i++) {
			int rectangleHeight = rectangleHeights[i], triangleHeight = triangleHeights[i];
			int width = triangleHeight * 2;
			// print triangle
			for (int t = 0; t < triangleHeight; t++) {
				int spaceOnEachSide = (width - 2) / 2 - t;
				int spaceInTheMiddle = (width - 2) - (2 * spaceOnEachSide);
				System.out.print(" ".repeat(spaceOnEachSide));
				System.out.print("/");
				System.out.print(" ".repeat(spaceInTheMiddle));
				System.out.print("\\");
				System.out.print(" ".repeat(spaceOnEachSide));
				System.out.println();
			}
			// print main bit of rectangle
			int spaceInTheMiddle = width - 2;
			String rectBody = "|" + " ".repeat(spaceInTheMiddle) + "|";
			for (int rect = 0; rect < rectangleHeight - 1; rect++) {
				System.out.println(rectBody);
			}
			// print last row of rectangle
			System.out.println("|" + "_".repeat(spaceInTheMiddle) + "|");
		}
	}

}
