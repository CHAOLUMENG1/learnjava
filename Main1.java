package jp.dcnet.it.c11;

//メインクラス
public class Main1 {
	public static void main(String[] args) {
		Train train = new Train(10, 5);
		int numPassengers = 31;
		for (int i = 0; i < numPassengers; i++) {
			if (train.addPassenger()) {
				System.out.println("定員オーバー");
			}
		}
		System.out.println("搭乗者数: " + train.getNumPassengers());
	}
}
