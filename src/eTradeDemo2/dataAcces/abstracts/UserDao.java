package eTradeDemo2.dataAcces.abstracts;

import java.util.List;

import eTradeDemo2.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void uptade(User user);
	void get(int id);
	List<User> getAll();
}
