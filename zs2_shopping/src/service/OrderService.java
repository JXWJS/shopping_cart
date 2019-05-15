package service;

import dao.OrderDao;
import dao.UserDao;
import entity.UserOrder;
import entity.ProductOrder;
import util.DateUtil;

public class OrderService {
	UserDao userDao;
	OrderDao orderDao;
	DateUtil dateUtil;
	
	public void insert(UserOrder order){
		orderDao=new OrderDao();
		orderDao.insert(order);
	}
	
	public void insertProduct(ProductOrder productOrder){
		orderDao=new OrderDao();
		orderDao.insertProduct(productOrder);
	}
	
	
	public String getAccountCode(String username){
		userDao=new UserDao();
		int id= userDao.queryByID(username);
		dateUtil=new DateUtil();
		String accountCode=dateUtil.createAccountCode(id);
		return accountCode;
		
	}
	
	public String getAccountDate(){
		dateUtil=new DateUtil();
		return dateUtil.nowDate();
		
	}
	

}
