package javaText;

public class Maxmin {
	/**
	 * 配列の最⼤値と最⼩桁値
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = max(array);
		//int min = min (array);
		System.out.println(max);

	}

	public static int max(int[] array) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > array.length) {
				max = array[i];
			}
			if (array[i] < array.length) {
				min = array[i];
			}
			System.out.println(min);
		}
		return max;

	}

}
