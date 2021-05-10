package eTradeDemo2.core;

public class GoogleAuthManager {
	public void register(String firstName, String lastName, String eMail, String passwort) {
		System.out.println("Google kayýtý baþarýlý : " + eMail);
	}
	
	public void login(String firstname ,String eMail , String passwort) {
		System.out.println("Google giriþi baþarýlý oldu : " + eMail);
	}
}
