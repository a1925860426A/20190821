package yxj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate������
 * @author yxj
 *
 */
public class HibernateUtil {
	private static Configuration conf;
	private final static SessionFactory sf;
	
	//����ִ��
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
