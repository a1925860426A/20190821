package yxj.dao;

import java.io.Serializable;

import yxj.entity.Users;
import yxj.util.HibernateUtil;

public class UserDao {

	public void save(Users user) {
		HibernateUtil.currentSession().save(user);
	}

	public Users get(Serializable id) {
		return (Users) HibernateUtil.currentSession().get(Users.class, id);
	}

	public void delete(Serializable id) {
		HibernateUtil.currentSession().delete(this.get(id));
	}
}
