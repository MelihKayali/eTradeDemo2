package eTradeDemo2.core;

public interface AuthService {
	void register(String firstName, String lastName , String eMail , String passwort);
	void login(String firstname ,String eMail , String passwort);
}
