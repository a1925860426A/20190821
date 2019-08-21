package yxj.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;

import yxj.dao.EmpDao;
import yxj.dao.HibernateUtil;
import yxj.entity.Emp;
import yxj.entity.EmpCondition;

public class EmpService {

	// 调用数据访问层
	EmpDao empDao = new EmpDao();

	// 使用动态查询
	public List<Emp> findEmpCondition(EmpCondition conditions) {
		List<Emp> emps = null;
		try {
			Transaction tx = HibernateUtil.currentSession().beginTransaction();
			StringBuilder hql = new StringBuilder("from Emp where 1=1 ");
			if (conditions.getJob() != null && conditions.getJob().length() > 0) {
				hql.append(" and job = :job");
			}
			if (conditions.getMoney() != null && conditions.getMoney() > 0) {
				hql.append(" and money > :money");
			}
			if (conditions.getFrom() != null) {
				hql.append(" and hireDate > :from");
			}
			if (conditions.getTo() != null) {
				hql.append(" and hireDate < :to");
			}
			emps = empDao.findEmpCondtion(hql.toString(), conditions);
			tx.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return emps;
	}

	// 使用分页查询
	public List<Emp> findPage(int pageNo, int pageSize) {
		List<Emp> list = null;
		try {
			Transaction transaction = HibernateUtil.currentSession().beginTransaction();
			list = empDao.findPage(pageNo, pageSize);
			transaction.commit();
		} catch (HibernateException e) {
			throw new ExceptionInInitializerError(e);
		}
		return list;
	}

	// 使用封装成Object对象的形式来实现
	public List<Object> findByProjection_1(){
		Transaction tx = null;
		List<Object> list = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			list = empDao.findByProjection_1();
			tx.commit();
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();
			}
		}
		return list;
	}

	//使用封装成数组的形式实现查询
	public List<Object[]> findByProjection_2(){
		Transaction tx = null;
		List<Object[]> list = null;
		try {
			tx = HibernateUtil.currentSession().beginTransaction();
			list = empDao.findByProjection_2();
			tx.commit();
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();
			}
		}
		return list;
	}
}
