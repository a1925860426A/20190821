package yxj.dao;

import yxj.entity.Emp;

public class EmpDao {

	public void saveOrUpdate(Emp emp) {
		HibernateUtil.currentSession().saveOrUpdate(emp);
	}
}
