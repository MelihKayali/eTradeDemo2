package eTradeDemo2;

import eTradeDemo2.business.abstracts.UserService;
import eTradeDemo2.business.concretes.AuthManager;
import eTradeDemo2.business.concretes.UserManager;
import eTradeDemo2.business.concretes.UserValidationManager;
import eTradeDemo2.business.concretes.eMailManager;
import eTradeDemo2.core.AuthService;
import eTradeDemo2.core.GoogleAuthManager;
import eTradeDemo2.core.GoogleAuthManagerAdapter;
import eTradeDemo2.dataAcces.concretes.InUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InUserDao());
		AuthService authService = new AuthManager(userService , new UserValidationManager() , new eMailManager());
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		
		authService.register("Melih", "KAYALI", "sjsjdkdk@gmail.com", "a1b2c3");
		authService.login("Melih", "sjsjdkdk@gmail.com","a1b2c3" );
		googleAuthService.login("Melih","sjsjdkdk@gmail.com" ,"a1b2c3" );
		googleAuthService.register("Melih", "KAYALI","sjsjdkdk@gmail.com" ,"a1b2c3" );
	}

}
