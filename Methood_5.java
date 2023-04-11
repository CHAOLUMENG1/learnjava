package jp.dcnet.it.c06;

/**
 * メソッドの実施結果を教えてください
 * @author CHAOY
 *
 */
public class Methood_5 {
	private static void fillArray(String[] array) {
		array = new String[] { "1", "2" };
	}

	public static void main(String args[]) {
		String[] array = null;
		fillArray(array);
		System.out.println(array == null);
	}
}
