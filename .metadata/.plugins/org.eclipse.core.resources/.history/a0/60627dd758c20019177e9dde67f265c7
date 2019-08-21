package yxj.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import yxj.entity.player;

public class PlayDao {

	@SuppressWarnings("unchecked")
	// 通过使用Query方法进行查询
	public List<player> findPlayerList() {
		return HibernateUtil.currentSession().createQuery("from player").list();
	}

	@SuppressWarnings("unchecked")
	// 通过使用迭代器的方式进行查询
	public Iterator<player> findPlayerIterator() {
		return HibernateUtil.currentSession().createQuery("from player").iterate();
	}

	@SuppressWarnings("unchecked")
	// 通过使用问号占位符的形式来实现有条件的查询查询
	public List<player> findPlayerBy_Name1(String NAME) {
		return HibernateUtil.currentSession().createQuery("from player where Name = ?	").setString(0, NAME).list();
	}

	@SuppressWarnings("unchecked")
	// 通过使用冒号的形式来实现有条件的查询
	public List<player> findPlayerBy_Name2(String NAME) {
		return HibernateUtil.currentSession().createQuery("from player where Name = :NAME").setString("NAME", NAME)
				.list();
	}

	@SuppressWarnings("unchecked")
	// 通过使用问号占位符数组的形式来实现有条件的查询查询
	public List<player> findPlayerBy_Params(Object[] params) {
		Query query = HibernateUtil.currentSession().createQuery("from player where Name = ? and ADDRESS = ?");
		if (params != null && params.length != 0) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		return query.list();
	}
	
	
}
