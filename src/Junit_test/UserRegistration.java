package Junit_test;

public class UserRegistration {
	public static void main(String[] args) {
		FirstName rv = new FirstName();
		rv.firstName();
	}
}

class FirstName {
	public void firstName() {
		String firstName = "Praveen";
		String regex = "^[A-Z]{1}[a-z]{2}[a-z]*";
		System.out.println(firstName.matches(regex));
	}
}