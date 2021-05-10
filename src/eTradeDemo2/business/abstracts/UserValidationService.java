package eTradeDemo2.business.abstracts;

import eTradeDemo2.entities.concretes.User;

public interface UserValidationService {
	boolean validate(User user);
}
