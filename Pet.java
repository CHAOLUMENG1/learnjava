package javaText;

public class Pet {

	protected String cat;
	protected String dog;
	protected int catAge;
	protected int dogAge;

	public Pet(String cat, String dog, int catAge, int dogAge) {

		/**this.cat = cat;
		this.catAge = catAge;
		this.dog = dog;
		this.dogAge = dogAge;**/
	}

	public String getCat() {
		return cat;
	}

	public  String getDog() {
		return dog;
	}

	public int getCatAge() {
		return catAge;
	}

	public int getDogAge() {
		return dogAge;
	}
}