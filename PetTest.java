package jp.dcnet.it.c07;

public class PetTest {

	public static void main(String[] args) {

		Pet cat = new Pet("cat", 2);
		Pet dog = new Pet("dog", 5);

		System.out.println(cat.getName() + ":" + cat.getAge());
		System.out.println(dog.getName() + ":" + dog.getAge());

	}

}