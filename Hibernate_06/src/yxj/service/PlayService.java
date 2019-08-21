package yxj.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import yxj.dao.HibernateUtil;
import yxj.dao.PlayDao;
import yxj.entity.player;

public class PlayService {

	//�������ݷ��ʲ�ķ���
	PlayDao playDao = new PlayDao();

	//ʹ��Query������ѯ
	public List<player> findPlayList() {
		List<player> list = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			list = playDao.findPlayerList();
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}
	
    //ʹ�õ�����������ѯ
	public Iterator<player> findPlayIterator() {
		Iterator<player> iterator = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			iterator = playDao.findPlayerIterator();
			while (iterator.hasNext()) {
				player play = (player) iterator.next();
				System.out.println(play.getNAME() + "\t" + play.getADDRESS());
			}
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return iterator;
	}

	//ʹ�õ�һ�ֲ����󶨵���ʽʵ��
	public List<player> findPlayBy_Name1(String Name) {
		List<player> list = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			list = playDao.findPlayerBy_Name1(Name);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return list;
	}

	//ʹ�õڶ��ֲ����󶨵���ʽʵ��
	public List<player> findPlayBy_Name2(String Name) {
		List<player> list = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			list = playDao.findPlayerBy_Name2(Name);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return list;
	}
	
	//ʹ���������ʽʵ��
	public List<player> findPlayBy_Params(Object [] params) {
		List<player> list = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			list = playDao.findPlayerBy_Params(params);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return list;
	}
}
