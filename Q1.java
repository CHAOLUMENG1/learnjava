package jp.dcnet.it.c08;

public class Q1 {
	/**
	 * コードの出⼒
	 * @param args
	 */
public static void main(String[] args) {
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y));
		String empty = "";
		String nullString = "null";
		System.out.println(nullString.equals(empty));//空白と文字の違い
	}

}
