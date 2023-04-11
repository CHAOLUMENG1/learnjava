package jp.dcnet.it.c06;

/**
 * bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください
 * @author CHAOY
 *
 */
public class Methood_8 {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 7, 9, 8, 6, 4 };
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
	}
}
