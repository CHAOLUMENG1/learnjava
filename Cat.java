package jp.dcnet.it.c09_Test;

//Catクラス
public class Cat extends Animal {
	public Cat(int age, String name, String classification) {
		super(age, name, classification);
	}

	@Override
	public void sayHello() {
		System.out.println("ニャー");
	}
}
