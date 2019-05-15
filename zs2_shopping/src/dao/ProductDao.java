package dao;

import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Product;
import entity.User;
import dao.ProductBaseDao;

import org.hibernate.Query;

public class ProductDao implements ProductBaseDao {
		static Session session;
		static Transaction ts;
	
	public  List<Product> queryProduct(){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		Query query=session.createQuery("from Product");
		
		List<Product> list=query.list();
		return list;
	}
	
	public List<Product> queryByPage(int page){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		
		List<Product> list=new ArrayList<Product>();
		Query query=session.createQuery("from Product").setMaxResults(5).
				setFirstResult((page-1)*2);
		list=query.list();
		return list;
		
	}
	
	public Product detailProduct(int id){
		session=HibernateUtil.openSession();
		ts=session.beginTransaction();
		String hql=" from Product where id=?";
		Query query= session.createQuery(hql);
		query.setInteger(0, id);
		List<Product> list=query.list();
		Product product=list.get(0);
		return product;
		
	}
	
	
	
	

}
