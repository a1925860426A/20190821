package yxj.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	// 定义加载Hibernate.cfg.xml文件
	private static Configuration conf;
	// 创建会话工厂
	private final static SessionFactory sf;

	static {
		try {
			//加载Hibernate主配置文件
            conf =new Configuration().configure();
            //通过主配置文件开启一个会话工厂
            sf =conf.buildSessionFactory();
		} catch (HibernateException e) {
			//手动抛出一个错误
		     throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session currentSession(){
		return sf.getCurrentSession();
	}
}
