package yxj.service;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import yxj.dao.UserDao;
import yxj.entity.Users;
import yxj.util.HibernateUtil;

public class UserService {

	UserDao userdao = new UserDao();

	public void save(Users user) {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			userdao.save(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}

	public Users get(Serializable id) {
		Transaction tx = null;
		Users user = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			user = userdao.get(id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
		return user;
	}

	public void delete(Serializable id) {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			userdao.delete(id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}

	public void update(Users user) {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			Users userupdate = userdao.get(user.getId());
			userupdate.setUsername(user.getUsername());
			userupdate.setPassword(user.getPassword());
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}

}
