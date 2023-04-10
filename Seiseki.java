package javaText;

public class Seiseki {
	/**
	 * 成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
	D, 60以下︓E」
	 * @param args
	 */

	public static void main(String[] args) {
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}

}
