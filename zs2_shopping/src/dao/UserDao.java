package dao;

import util.HibernateUtil;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import dao.UserBaseDao;

import java.util.List;

public class UserDao implements UserBaseDao{
	 Session session=null;
	 Transaction ts=null;
	
	public  void register(User user){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		session.save(user);
		ts.commit();
		HibernateUtil.closeSession(session);
		
	}
	
	public  boolean checkLogin(User user){
		boolean flag=false;
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		try{
			String hql=" from User where username=? and password=?";
			Query query= session.createQuery(hql);
			query.setString(0, user.getUsername());
			query.setString(1, user.getPassword());
			List list=query.list();
			if(!list.isEmpty()){
				flag=true;
			}else{
				flag=false;
			}
			ts.commit();
			HibernateUtil.closeSession(session);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return flag;
		
	}
	
	public int queryByID(String username){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		String  hql="from User where username=?";
		Query query= session.createQuery(hql);
		query.setString(0, username);
		List<User> users=query.list();
		User user=users.get(0);
		int id=user.getId();
		return id;
		
	}
	
	

}
