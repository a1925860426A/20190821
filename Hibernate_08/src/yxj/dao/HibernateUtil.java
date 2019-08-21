package yxj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate工具类
 * @author yxj
 *
 */
public class HibernateUtil {
	private static Configuration conf;
	private final static SessionFactory sf;
	
	//优先执行
	static{
		try {
			conf  = new Configuration().configure();
			sf = conf.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session currentSession(){
		return sf.getCurrentSession();
	}
}
