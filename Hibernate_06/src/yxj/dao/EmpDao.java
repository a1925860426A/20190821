package yxj.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import yxj.entity.Emp;
import yxj.entity.EmpCondition;

/**
 * 员工数据访问层
 * 
 * @author yxj
 *
 */
@SuppressWarnings("unused")
public class EmpDao {

	// 动态查询
	@SuppressWarnings("unchecked")
	public List<Emp> findEmpCondtion(String hql, EmpCondition conditions) {
		Query query = HibernateUtil.currentSession().createQuery(hql).setProperties(conditions);
		return query.list();
	}

	// 分页查询
	@SuppressWarnings("unchecked")
	public List<Emp> findPage(int pageNo, int pageSize) {
		Query query = HibernateUtil.currentSession().createQuery("from Emp order by empNo")
				.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize);
		return query.list();
	}

	// 封装成Object对象
	@SuppressWarnings("unchecked")
	public List<Object> findByProjection_1() {
		return HibernateUtil.currentSession().createQuery("select empNo from EMP").list();
	}

	// 封装成Object数组
	@SuppressWarnings("unchecked")
	public List<Object[]> findByProjection_2() {
		return HibernateUtil.currentSession().createQuery("select empName,Money from Emp").list();
	}

}
