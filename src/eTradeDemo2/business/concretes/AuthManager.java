package eTradeDemo2.business.concretes;

import eTradeDemo2.business.abstracts.UserService;
import eTradeDemo2.business.abstracts.UserValidationService;
import eTradeDemo2.business.abstracts.eMailService;
import eTradeDemo2.core.AuthService;

public class AuthManager implements AuthService {
	
	UserService userService;
	UserValidationService userValidationService;
	eMailService emailService;
	
	public AuthManager(UserService userService, UserValidationService userValidationService, eMailService emailService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(String firstName, String lastName, String eMail, String passwort) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String firstname, String eMail, String passwort) {
		// TODO Auto-generated method stub
		
	}

}
