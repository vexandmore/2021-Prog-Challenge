import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfCases = in.nextInt();
		in.nextLine(); // grab \n left from previous integer.
		
		// get all input lines
		String[] inputs = new String[numberOfCases];
		for (int i = 0; i < numberOfCases; i++) {
			inputs[i] = in.nextLine();
		}
		// execute all input lines
		for (int i = 0; i < inputs.length; i++) {
			executeInputLine(inputs[i]);
		}
	}
	
	private static void executeInputLine(String line) {
		// create array, initialize switches to false *for each test*
		boolean[] switches = new boolean[3];
		// find the commands and execute each
		String[] commands = line.split(" ");
		for (String command: commands) {
			// try and parse the command, and flip the appropriate switch
			try {
				int switchNumber = Integer.parseInt(command.substring(1));
				switches[switchNumber - 1] = !switches[switchNumber - 1];
			} catch (RuntimeException e) {
				System.err.println("Invalid command entered: " + command);
			}
		}
		// print result of the switches
		for (int switchI = 0; switchI < switches.length; switchI++) {
			System.out.print(switches[switchI] ? "True " : "False ");
		}
		System.out.println();
	}
}
