package javaText;

public class Coin {
	/**
	 * ⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０
	円のコイン数をもとめください。
	 * @param args
	 */

	public static int[] YEN_TYPES = { 500, 100, 50, 10, 5, 1 };

	public static int[] getYenCount(int yen, int[] yentype) {
		int[] count = new int[yentype.length];

		for (int i = 0; i < yentype.length; i++) {
			while (yen >= yentype[i]) {
				yen -= yentype[i];
				count[i]++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int yen = 3340;
		int[] count = getYenCount(yen, YEN_TYPES);
		for (int i = 0; i < YEN_TYPES.length; i++) {

			System.out.println(YEN_TYPES[i] + "円:" + count[i] + "枚");
		}
	}
}
