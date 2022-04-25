package section8;

import java.util.ArrayList;

public class MobilePhone {
	public static ArrayList<Contact> myContacts;
	
	public MobilePhone(String x) {
		myContacts = new ArrayList<>();
	}
	
	public boolean addNewContact(Contact c) {
		if(myContacts.contains(c)) {
			return false;
		}
		myContacts.add(c);
		return true;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		if(findContact(oldContact) < 0) {
			return false;
		}
		myContacts.set(myContacts.indexOf(oldContact), newContact);
		return true;
	}
	
	public boolean removeContact(Contact c) {
		return myContacts.remove(c);
	}
	
	public static int findContact(Contact c) {
		return myContacts.indexOf(c);
	}
	
	public static int findContact(String s) {
		int index = -1;
		for(int i = 0; i < myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(s)){
				System.out.println(s + " is in contact list");
				index = i;
			}
		}return index;
	}
	
	public Contact queryContact(String s) {
		Contact mydude = null;
		for(int i = 0; i < myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(s)) {
				 mydude = myContacts.get(i);
			}
		}
		return mydude;
	}
	
	public void printContacts() {
		for(Contact c: myContacts) {
			System.out.println(c.getName() + " -> " + c.getPhoneNumber());
		}
	}	
	
	public static void main(String[] args) {
		MobilePhone m = new MobilePhone("2367955272");
		Contact one = new Contact("Gloria", "1");
		Contact two = new Contact("Brodi", "2");
		m.addNewContact(one);
		m.addNewContact(two);
		m.printContacts();
		Contact three = new Contact("Leroy", "3");
		System.out.println(m.addNewContact(three));
		System.out.println(m.addNewContact(one));
		m.printContacts();
		System.out.println(m.addNewContact(three));
		

		
	}
}
