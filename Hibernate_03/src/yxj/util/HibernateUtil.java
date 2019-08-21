package yxj.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	// �������Hibernate.cfg.xml�ļ�
	private static Configuration conf;
	// �����Ự����
	private final static SessionFactory sf;

	static {
		try {
			//����Hibernate�������ļ�
            conf =new Configuration().configure();
            //ͨ���������ļ�����һ���Ự����
            sf =conf.buildSessionFactory();
		} catch (HibernateException e) {
			//�ֶ��׳�һ������
		     throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session currentSession(){
		return sf.getCurrentSession();
	}
}
