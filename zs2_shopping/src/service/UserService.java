package service;

import dao.UserDao;
import entity.User;

public class UserService {
	
	UserDao userDao=new UserDao();

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public  void register(User user){
		userDao.register(user);
	}
	

	public  boolean checkLogin(User user){
		return userDao.checkLogin(user);
	}
	
	public int queryByID(String username){
		return userDao.queryByID(username);
	}

}
