package dao;

import entity.UserOrder;
import entity.ProductOrder;
import util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrderDao implements OrderBaseDao {
	Session session;
	Transaction ts;
	
	public void insert(UserOrder order){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		session.save(order);
		ts.commit();
		HibernateUtil.closeSession(session);
	}
	
	public void insertProduct(ProductOrder productOrder){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		session.save(productOrder);
		ts.commit();
		HibernateUtil.closeSession(session);
	}

}
