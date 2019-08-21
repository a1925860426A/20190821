package yxj.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import yxj.entity.player;

public class PlayDao {

	@SuppressWarnings("unchecked")
	// ͨ��ʹ��Query�������в�ѯ
	public List<player> findPlayerList() {
		return HibernateUtil.currentSession().createQuery("from player").list();
	}

	@SuppressWarnings("unchecked")
	// ͨ��ʹ�õ������ķ�ʽ���в�ѯ
	public Iterator<player> findPlayerIterator() {
		return HibernateUtil.currentSession().createQuery("from player").iterate();
	}

	@SuppressWarnings("unchecked")
	// ͨ��ʹ���ʺ�ռλ������ʽ��ʵ���������Ĳ�ѯ��ѯ
	public List<player> findPlayerBy_Name1(String NAME) {
		return HibernateUtil.currentSession().createQuery("from player where Name = ?	").setString(0, NAME).list();
	}

	@SuppressWarnings("unchecked")
	// ͨ��ʹ��ð�ŵ���ʽ��ʵ���������Ĳ�ѯ
	public List<player> findPlayerBy_Name2(String NAME) {
		return HibernateUtil.currentSession().createQuery("from player where Name = :NAME").setString("NAME", NAME)
				.list();
	}

	@SuppressWarnings("unchecked")
	// ͨ��ʹ���ʺ�ռλ���������ʽ��ʵ���������Ĳ�ѯ��ѯ
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
