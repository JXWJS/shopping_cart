package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	
	private HibernateUtil(){
		
	}
	
	static {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static Session openSession(){
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session !=null && session.isOpen()){
			session.close();
		}
	}
	
	public static Session getCurrentSession(){
		Session session=threadLocal.get();
		if(session == null){
			session=sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	
	

}
