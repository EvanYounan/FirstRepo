package week3lab;

public class Author {

	private String firstName = "";
	private String lastName = "";
	
	Author(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String newFirst) {
		this.firstName = newFirst;
	}
	
	public void setLastName(String newLast) {
		this.lastName = newLast;
	}
	
	public String toString() {
		return this.lastName + ", " + this.firstName;
	}
	
	public static void main(String[] args) {
		Author h = new Author("Susan", "Herrera");
		System.out.println(h);
	}

}
