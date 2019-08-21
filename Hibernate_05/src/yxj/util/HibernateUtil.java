package yxj.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Configuration conf;
	private final static SessionFactory sf;

	static {
		try {
			conf = new Configuration().configure();
			sf = conf.buildSessionFactory();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session currentSeesion(){
		return sf.getCurrentSession();
	}
}
