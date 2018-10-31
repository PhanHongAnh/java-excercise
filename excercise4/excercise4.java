package excercise4;

public class excercise4 {
	public static void main(String[] args) {
		String s = "aaabbccdddefghjjkklmn";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (s.charAt(i) != s.charAt(i + 1)) {
					result = result + s.charAt(i);
				}
			} else if (i == s.length() - 1) {
				if (s.charAt(i - 1) != s.charAt(i)) {
					result = result + s.charAt(i);
				}
			} else {
				if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i + 1) != s.charAt(i)) {
					result = result + s.charAt(i);
				} else if (result != "") {
					break;
				}
			}
		}
		System.out.println(result);
	}
}
