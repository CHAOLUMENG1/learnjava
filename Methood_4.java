package jp.dcnet.it.c06;

/**
 * メソッドの実施結果を教えてください
 * @author CHAOY
 *
 */
public class Methood_4 {
	private static void fillArray(String[] array) {
		array[0] = "value2";
	}

	public static void main(String args[]) {
		String[] array = new String[] { "value1" };
		fillArray(array);
		System.out.println(array[0]);
	}
}
