package excercise1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Excercise1 {
	private static Scanner scan = new Scanner(System.in);
	private static String[] strArray;

	public static void main(String[] args) {
		// scan string
		System.out.print("Input a string: ");
		String str = scan.nextLine();
		System.out.println(str);

		// split string to array
		String delimiter = " ";
		strArray = str.split(delimiter);

		// count each letter in string use Map
		Map<String, Integer> numStrs = new HashMap<String, Integer>();

		for (String s: strArray) {
			if (!numStrs.containsKey(s)) {
				numStrs.put(s, 1);
			} else {
				numStrs.put(s, numStrs.get(s) + 1);
			}
		}
		System.out.println(numStrs);
	}
}
