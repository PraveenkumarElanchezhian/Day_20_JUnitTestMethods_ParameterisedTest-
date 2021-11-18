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
		String mobileNumber="91 9508865777";
		String regEx_Name = "\\b([A-Z]\\w*)\\b";
		String regEx_email = "^(.+)@(.+)$";
		String regex_MobileNumber="[1-9]{2}[ \\S\\s]{1}+[1-9]*]";
		System.out.println(firstName.matches(regEx_Name));
		System.out.println(lastName.matches(regEx_Name));
		System.out.println(email.matches(regEx_email));
		System.out.println(mobileNumber.matches(regex_MobileNumber));
	}
}