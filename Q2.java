package jp.dcnet.it.c09;

public class Q2 {
	public static void main(String... args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("thread running...");
			}
		}.start();
	}
}
