package util;

import util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Product;

import org.hibernate.Query;

import java.util.List;
public class HibernateTest {
	
	public static void main(String arg[]){
		Transaction tx=null;
		
//		Product product=new Product();
//		product.setId(7);
//		product.setName("mango");
//		product.setCount(100);
//		product.setPrice(5);
		
		Session session=HibernateUtil.openSession();
		tx=session.beginTransaction();
		
		//Product product=(Product) session.get(Product.class, 3 ); //id≤È—Ø
		//Product p=(Product)session.load(Product.class, 3); 
//		Query query=session.createQuery("from Product product where product.id=3");
//		System.out.print();
		Query query=session.createQuery("from Product");
		List<Product> list=query.list();
		for (Product product :list){
			int id=product.getId();
			System.out.println(id);
		}
		//System.out.println(id);
//		session.saveOrUpdate(product);
		
		tx.commit();
		HibernateUtil.closeSession(session);
		
		
	}

}
