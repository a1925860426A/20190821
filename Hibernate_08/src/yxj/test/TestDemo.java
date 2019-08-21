package yxj.test;

import org.junit.Test;

import yxj.entity.Dept;
import yxj.entity.Emp;
import yxj.service.EmpService;

public class TestDemo {

	EmpService empService = new EmpService();

	@Test
	public void saveOrUpdateTest() {
		Emp emp = new Emp();
		emp.setEmpNo(2);
		emp.setEmpName("¹·×Ó");
		Dept dept = new Dept();
		dept.setDeptNo(1);
		emp.setDept(dept);
		empService.saveOrUpdate(emp);
	}

}
