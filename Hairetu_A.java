package javaText;

public class Hairetu_A {
	/**
	 * 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4 };
		// start = 1, length = 2
		int[] result = new int[] { 2, 3 };

		System.out.print(subarray);

	}

	public static int[] subArray(int[] array, int begin, int length) {

		int[] subarray = new int[length];
		for (int i = 0; i < length; i++) {
			subarray[i] = array[begin];
			begin++;
		}
		return subarray;
	}
}
