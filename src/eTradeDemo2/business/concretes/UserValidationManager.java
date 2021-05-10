package eTradeDemo2.business.concretes;

import eTradeDemo2.business.abstracts.UserValidationService;
import eTradeDemo2.entities.concretes.User;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(User user) {
		System.out.println("Kullanýcý doðrulandý");
		return false;
	}

}
