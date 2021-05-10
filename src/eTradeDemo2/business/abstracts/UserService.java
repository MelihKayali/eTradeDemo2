package eTradeDemo2.business.abstracts;

import java.util.List;

import eTradeDemo2.entities.concretes.User;

public interface UserService {
	void add(User user);
	void remove(User user);
	void uptade(User user);
	void get(int id);
	
	List<User> getAll();
}
