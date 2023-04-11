package jp.dcnet.it.c04;

public class Q6 {
	/**
	 * 配列のSUMを求める。
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40 };
		int sum = 0;

		// 各要素の値を合計する
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("配列の合計値は: " + sum);
	}

}
