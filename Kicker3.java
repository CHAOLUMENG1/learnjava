package javaText;

public class Kicker3 {
	private static void fillArray(String[] array) {
		array = new String[] { "1", "2" };
	}

	public static void main(String args[]) {
		String[] array = null;
		fillArray(array);
		System.out.println(array == null);
	}
}
