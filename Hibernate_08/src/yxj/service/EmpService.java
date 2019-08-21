package yxj.service;

import org.hibernate.Transaction;

import yxj.dao.EmpDao;
import yxj.dao.HibernateUtil;
import yxj.entity.Emp;

public class EmpService {

	EmpDao empDao = new EmpDao();

	public void saveOrUpdate(Emp emp) {
		Transaction tx = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			empDao.saveOrUpdate(emp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}

}
