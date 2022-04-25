package section8;

public class Contact {
	private final String name;
	private final String phoneNumber;
	
	public Contact(String name, String number) {
		this.name = name;
		this.phoneNumber = number;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public static Contact createContact(String name, String number) {
		return new Contact(name, number);
	}
}
