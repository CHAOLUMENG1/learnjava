package jp.dcnet.it.c06;

/**
 * 配列の最⼤値、最⼩値
 * @author CHAOY
 * @since 
 *
 */
public class Methood_2 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = max(array);
		int min = min(array);
		System.out.println("配列の最⼤値:" + max);
		System.out.println("配列の最⼩値:" + min);
	}

	/**
	 * 最大値処理
	 * @param array
	 * @return
	 */
	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;

	}

	/**
	 * 最⼩値処理
	 * @param array
	 * @return
	 */
	public static int min(int[] array) {
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
			}
		}
		return min;

	}

}
