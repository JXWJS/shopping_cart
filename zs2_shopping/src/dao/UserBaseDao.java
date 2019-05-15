package dao;

import entity.User;

public interface UserBaseDao {

	public void register(User user);
	
	public  boolean checkLogin(User user);
}
