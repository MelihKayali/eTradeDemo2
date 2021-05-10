package eTradeDemo2.core;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void register(String firstName, String lastName, String eMail, String passwort) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(firstName, lastName, eMail, passwort);
		
		
		System.out.println("Siteye kayýt olundu");
		
	}

	@Override
	public void login(String firstname, String eMail, String passwort) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(firstname, eMail, passwort);
		
		
		System.out.println("Siteye giriþ yapýldý");
		
	}

}
