package string;

public class StringCon {

	public static void main(String[] args) {

		String longStr = "This could have been " + "a very long lin that would have "
				+ "warpped around. But string concatenation " + "prevents this.";

		System.out.println(longStr);

		String s = "Four: " + (2 + 22);
		System.out.println(s);

	}
}
