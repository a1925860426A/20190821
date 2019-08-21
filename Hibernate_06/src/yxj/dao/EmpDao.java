package yxj.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import yxj.entity.Emp;
import yxj.entity.EmpCondition;

/**
 * Ա�����ݷ��ʲ�
 * 
 * @author yxj
 *
 */
@SuppressWarnings("unused")
public class EmpDao {

	// ��̬��ѯ
	@SuppressWarnings("unchecked")
	public List<Emp> findEmpCondtion(String hql, EmpCondition conditions) {
		Query query = HibernateUtil.currentSession().createQuery(hql).setProperties(conditions);
		return query.list();
	}

	// ��ҳ��ѯ
	@SuppressWarnings("unchecked")
	public List<Emp> findPage(int pageNo, int pageSize) {
		Query query = HibernateUtil.currentSession().createQuery("from Emp order by empNo")
				.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize);
		return query.list();
	}

	// ��װ��Object����
	@SuppressWarnings("unchecked")
	public List<Object> findByProjection_1() {
		return HibernateUtil.currentSession().createQuery("select empNo from EMP").list();
	}

	// ��װ��Object����
	@SuppressWarnings("unchecked")
	public List<Object[]> findByProjection_2() {
		return HibernateUtil.currentSession().createQuery("select empName,Money from Emp").list();
	}

}