package eTradeDemo2.business.concretes;

import java.util.List;

import eTradeDemo2.business.abstracts.UserService;
import eTradeDemo2.dataAcces.abstracts.UserDao;
import eTradeDemo2.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void remove(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void uptade(User user) {
		userDao.uptade(user);
		
	}

	@Override
	public void get(int id) {
		return;
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
		
	}

}
