public class PancakeManeuver {
	
	private static String pancakeStack = "--+-";
	private static int numOfPancakesToLift = 3;
	
	public static void main(String[] args) {
		System.out.println(maneuver(pancakeStack, numOfPancakesToLift));
	}
	
	// This is the known pancake maneuver.
	public static String maneuver(String pancakeStack, int numOfPancakes) {
		String group1 = "", group2 = "";
		for (int i = 0; i < pancakeStack.length(); i++) {
			char pancake = pancakeStack.charAt(i);
			if (i < numOfPancakes) {
				group1 += pancake;
			} else {
				group2 += pancake;
			}
		}
		String result = flipPancakesIn(reverse(group1)) + group2;
		return result;
	}

	// Reverses a string.
	public static String reverse(String pancakeStack) {
		String result = "";
		for (int i = pancakeStack.length(); i > 0; i--) {
			result += pancakeStack.charAt(i-1);
		}
		return result;
	}

	// Flips pluses to minuses, and flips minuses to pluses.
	public static String flipPancakesIn(String pancakeStack) {
		String result = "";
		for (int i = 0; i < pancakeStack.length(); i++) {
			char pancake = pancakeStack.charAt(i);
			if (pancake == '+') {
				result += '-';
			} else {
				result += '+';
			}
		}
		return result;
	}

}