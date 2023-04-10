package javaText;

public class Max {

	public static void main(String[] args) {

		int[] datas = new int[] { 2,4,6,8,3,5 };
		//int [] i= {0};
		int max = max(datas);
		int min = min(datas);
		int sum = sum(datas);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

	/**
	 * Max
	 * @param datas
	 * @return
	 */
	public static int max(int[] datas) {

		int max = 0;

		for (int i = 0; i < datas.length; i++) {

			if (datas[i] > max) {

				max = datas[i];

			}
		}
		return max;
	}
	/**
	 * Min
	 * @param datas
	 * @return
	 */

	public static int min(int[] datas) {

		int min = 0;

		for (int i = 0; i < datas.length; i++) {

			if (datas[i] < min) {

				min = datas[i];

			}

		}
		return min;
	}
	/**
	 * Sum
	 * @param datas
	 * @return
	 */

	public static int sum(int[] datas) {

		int sum = 0;

		for (int i = 0; i < datas.length; i++) {

			sum = sum + i;

		}

		return sum;
	}
}
