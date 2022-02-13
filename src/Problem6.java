import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// NOTE: because all java ints are signed, to be able to store
		// all values up to 65,535, it is necessary to use java's 32 bit
		// integers (trying to make signed ints unsigned is a pain from 
		// what I've heard).
		
		Scanner in = new Scanner(System.in);
		int numberOfCases = in.nextInt();
		int[] inputNumbers = new int[numberOfCases];
		
		// receive all input
		for (int i= 0; i < inputNumbers.length; i++) {
			inputNumbers[i] = in.nextInt();
		}
		// print all output
		for (int i = 0; i < inputNumbers.length; i++) {
			System.out.println(toBarcode(inputNumbers[i]));
		}
	}
	
	/**
	 * Turns the given integer into a barcode, per the problem 
	 * description.
	 * @param input In the range [1, 65535]
	 * @return barcode of the int
	 */
	private static String toBarcode(int input) {
		// construct buffer of the correct size
		// note: could have used a new char[18] here if you want to.
		StringBuilder builder = new StringBuilder(18);
		builder.append("#");
		
		// integers in basically and programming language (note that JavaScript doesn't
		// have built-in integers to my knowledge) are stored in binary. Each column represents
		// a power of 2, with the power increasing as we move left.
		// So binary 1 is decimal 1, but binary 10 is decimal 2. And binary 100 is decimal 4, 
		// binary 101 is decimal 5, so on.
		
		// Here, I extract the 16 least significant bits of the input, as the problem states,
		// and turn them into "|" or " ".
		for (int i = 0; i < 16; i++) {
			int currentBit = input % 2; // remainder after division by 2; gets the least significant bit.
			char nextChar = currentBit == 0 ? ' ' : '|';
			builder.append(nextChar);
			input  = input >> 1; // right bit shift; this causes the bits to shift to the right.
		}
		builder.append('#');
		builder.reverse(); // have to reverse the builder, since it appends left-to-right.
		return builder.toString();
	}

}
