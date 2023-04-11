package jp.dcnet.it.c04;

public class Q7 {
	/**
	 * ⾏列（２次元配列）の和と積を計算
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4 }, { 21, 22, 23, 24 } };
		int sum = 0;
		int product = 0;
		/**
		 * ２次元配列の和
		 */
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum = array[i][j] + array[i][j];
				System.out.print(sum + " ");
			}
		}
		/**
		 * ２次元配列の積
		 */
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				product = array[i][j] * array[i][j];
				System.out.print(product + " ");
			}
		}
	}
}