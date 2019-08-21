package yxj.service;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import yxj.dao.playerDao;
import yxj.entity.player;
import yxj.util.HibernateUtil;

public class playService {

	playerDao playDao = new playerDao();

	public void save(player play) {
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			playDao.save(play);
			transaction.commit();
		} catch (HibernateException H) {
		}
	}
}
