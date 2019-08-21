package yxj.dao;

import java.io.Serializable;

import yxj.entity.player;
import yxj.util.HibernateUtil;

public class playerDao {

	public void save(player play) {
		HibernateUtil.currentSeesion().save(play);
	}

	public player findPlayBy_id(Serializable ID) {
		return (player) HibernateUtil.currentSeesion().get(player.class, ID);
	}

	public void deletePlayBy_id(Serializable ID) {

	}
}
