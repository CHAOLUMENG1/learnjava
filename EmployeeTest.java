package jp.dcnet.it.c08;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee x = new Employee("1234");
		Employee y = new Employee("1234");
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?
	}
}
