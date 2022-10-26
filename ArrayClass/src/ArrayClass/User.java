package ArrayClass;

public class User {
	private String firstName;
	private String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName= firstName.toUpperCase();
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}	
	public String getFirstName() {
		return firstName;
	}
	
	
}
