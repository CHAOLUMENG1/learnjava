package jp.dcnet.it.c08;
/**
 * コンパイルを修正
 * @author CHAOY
 *
 */
public class ParentTest {
	public static void print(Parent parent) {
		parent.hello();
	}

	public static void main(String[] args) {
		print(new Parent());
		print(new Child());
	}
}
