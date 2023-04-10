package javaText;

public class Speed {
	/**
	 * 重⼒加速度処理
	 * @param t
	 * @return
	 */
	public static float gAcceleration(float t) {
		float y = 9.8F * t * t / 2;
		return y;

	}

	public static void main(String[] args) {
		float t = 1.0F;
		float y = 9.8F * t * t / 2;
		System.out.println(y);

	}
}
