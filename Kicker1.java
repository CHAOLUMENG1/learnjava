package javaText;

public class Kicker1 {
	private static void sayHello(String y) {
		y = "Hello world";
	}

	public static void main(String args[]) {
		String x = null;
		sayHello(x);
		System.out.println(x);
	}
}
