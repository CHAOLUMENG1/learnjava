package jp.dcnet.it.c09_Test;

//Dogクラス
public class Dog extends Animal {
	public Dog(int age, String name, String classification) {
		super(age, name, classification);
	}

	@Override
	public void sayHello() {
		System.out.println("ワン");
	}
}