package Junit_test;

public class UserRegistration {
	public static void main(String[] args) {
		Name rv = new Name();
		rv.first_LastName();
	}
}

class Name {
	public void first_LastName() {
		String firstName = "Praveen";
		String lastName="Kumar";
		String email="abc.xyx@bl.co.in";
		String regEx_Name = "^[A-Z]{1}[a-z]{2}[a-z]*";
		String regEx_email = "^(.+)@(.+)$";
		System.out.println(firstName.matches(regEx_Name));
		System.out.println(lastName.matches(regEx_Name));
		System.out.println(email.matches(regEx_email));
	}
}