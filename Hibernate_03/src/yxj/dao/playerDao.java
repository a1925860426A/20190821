package yxj.dao;

import yxj.entity.player;
import yxj.util.HibernateUtil;

public class playerDao {

	public void save(player play) {
		HibernateUtil.currentSession().save(play);
	}
}
