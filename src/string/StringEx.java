package string;

public class StringEx {

	public static void main(String[] args) {

		char[] c = { 'A', 'S', 'H', 'I', 'S', 'H', '\n' };
		String s = new String(c, 0, 6);
		System.out.println(s);

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);
		}
		System.out.println(c);

		char a[] = { 'J', 'A', 'V', 'A' };

		String book1 = new String(a);
		String book2 = new String(book1);

		System.out.println(a);
		System.out.println(book1);
		System.out.println(book2);
	}
}
