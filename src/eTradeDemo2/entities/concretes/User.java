package eTradeDemo2.entities.concretes;

import eTradeDemo2.entities.abstracts.Entity;

public class User implements Entity{
	int id;
	String firstName;
	String lastName;
	String eMail;
	String passwort;
	
	public  User(String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(int id, String firstName, String lastName, String eMail, String passwort) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.passwort = passwort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
}
