package eTradeDemo2.core;

public class GoogleAuthManager {
	public void register(String firstName, String lastName, String eMail, String passwort) {
		System.out.println("Google kay�t� ba�ar�l� : " + eMail);
	}
	
	public void login(String firstname ,String eMail , String passwort) {
		System.out.println("Google giri�i ba�ar�l� oldu : " + eMail);
	}
}
