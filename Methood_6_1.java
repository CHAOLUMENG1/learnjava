package jp.dcnet.it.c06;

public class Methood_6_1 {

	public static void main(String[] args) {

		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result = megerArray(left, right);

		printArray(result);

	}

	/**
	 * 引数left と 引数right をマージして、新しい配列を作成して返却する。
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];

		//  処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する

		for (int i = 0; i < left.length; i++) {

			result[i] = left[i];

		}

		for (int j = 0; j < right.length; j++) {

			result[j + left.length] = right[j];

		}

		return result;

	}

	/**
	 * Print
	 * @param objs
	 */
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
