package javaText;

public class HumanTest {

	public static void main(String[] args) {

		Human human = new Human();
		human.setName("chao");

		System.out.println(human.getName());
		System.out.println(human.getAge());
		human.sleep();

		//System.out.println(Math.round(333.444f));

	}
}
