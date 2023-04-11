package jp.dcnet.it.c06;

/**
 * メソッドの実施結果を教えてください。
 * @author CHAOY
 *
 */

public class Methood_3 {
	private static void sayHello(String y) {
		y = "Hello world";
	}

	public static void main(String args[]) {
		String x = null;
		sayHello(x);
		System.out.println(x);
	}
}
