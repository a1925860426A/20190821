package yxj.service;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import yxj.dao.playerDao;
import yxj.entity.player;
import yxj.util.HibernateUtil;

public class playerService {

	playerDao playDao = new playerDao();

	//添加玩家方法
	public void save(player play) {
		try {
			Transaction transaction = HibernateUtil.currentSeesion().beginTransaction();
			playDao.save(play);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	//根据ID查找一个对象
	public player findPlayBy_Id(Serializable ID) {
		player play = null;
		try {
			Transaction transaction = HibernateUtil.currentSeesion().beginTransaction();
			playDao.findPlayBy_id(ID);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return play;
	}
}
