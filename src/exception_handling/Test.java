package exception_handling;

public class Test {
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);

		} catch (NumberFormatException nfe) {
			f = 0;

		} finally {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		parse("invalid");
	}
}
