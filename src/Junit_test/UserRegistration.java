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
		String regex = "^[A-Z]{1}[a-z]{2}[a-z]*";
		System.out.println(firstName.matches(regex));
		System.out.println(lastName.matches(regex));
	}
}