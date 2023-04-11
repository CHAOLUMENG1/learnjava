package jp.dcnet.it.c06;

public class Methood_6_2 {
		/**
		 * 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		 * @param args
		 */

		public static void main(String[] args) {
			int[] array = new int[] { 1, 2, 3, 4 };
			//start = 1, length = 2
			//int[] result = new int[] { 2, 3 };

			printArray(subArray(array, 1, 2));

		}

		public static int[] subArray(int[] array, int begin, int length) {

			int[] subarray = new int[length];
			for (int i = 0; i < length; i++) {
				subarray[i] = array[begin];
				begin++;
			}
			return subarray;
		}

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
