package jp.dcnet.it.c06;

/**
 * charの配列先頭と末尾の空⽩⽂字列を削除してください
 */
import java.util.Arrays;

public class Methood_7 {
	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };

		int start = 0;
		int end = input.length - 1;

		// 先頭から空白文字列を削除
		while (start < end && input[start] == ' ') {
			start++;
		}

		// 末尾から空白文字列を削除
		while (end >= start && input[end] == ' ') {
			end--;
		}

		// 新しい配列を作成
		char[] output = Arrays.copyOfRange(input, start, end + 1);
		System.out.println(Arrays.toString(output));

	}
}
