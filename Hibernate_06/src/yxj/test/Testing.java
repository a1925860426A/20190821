package yxj.test;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import yxj.dao.Tools;
import yxj.entity.Emp;
import yxj.entity.EmpCondition;
import yxj.entity.player;
import yxj.service.EmpService;
import yxj.service.PlayService;

public class Testing {

	PlayService playService = new PlayService();
	EmpService empService = new EmpService();

	// 使用List方法查找玩家
	@Test
	public void findPlayerList() {
		List<player> list = playService.findPlayList();
		for (player play : list) {
			System.out.println(play.getNAME() + "\t" + play.getSEX() + "\t" + play.getHOBBIES());
		}
	}

	// 使用Iterator方法查找玩家
	@Test
	public void findPlayerIterator() {
		playService.findPlayIterator();
	}

	// 使用参数下标绑定的形式进行查询1
	@Test
	public void findUserByName1() {
		List<player> list = playService.findPlayBy_Name1("杨行军");
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// 使用参数下标绑定的形式进行查询2
	@Test
	public void findUserByName2() {
		List<player> list = playService.findPlayBy_Name2("刘宇蕾");
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// 使用数组的形式进行查询
	@Test
	public void findUserBy_Params() {
		Object[] params = { "刘宇蕾", "瑜伽" };
		List<player> list = playService.findPlayBy_Params(params);
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// 使用动态的方式查询
	@Test
	public void findEmpCondition() throws ParseException {
		EmpCondition conditions = new EmpCondition();
		conditions.setJob("部长");
		conditions.setMoney(90000);
		conditions.setFrom(Tools.strToDate("2010-1-1", "yyyy-MM-dd"));
		conditions.setTo(Tools.strToDate("2013-1-1", "yyyy-MM-dd"));
		List<Emp> list = empService.findEmpCondition(conditions);
		if (list != null) {
			for (Emp emp : list) {
				System.err.println(
						emp.getEmpNo() + "\t" + emp.getEmpName() + "\t" + emp.getJob() + "\t" + emp.getMoney());
			}
		}
	}

	// 使用分页查询
	@Test
	public void findPage() {
		int pageNo = 1;
		int pageSize = 5;
		List<Emp> list = empService.findPage(pageNo, pageSize);
		if (list != null) {
			for (Emp emp : list) {
				System.err.println(
						emp.getEmpNo() + "\t" + emp.getEmpName() + "\t" + emp.getJob() + "\t" + emp.getMoney());
			}
		}
	}

	// 使用封装成Object对象的形式查询
	@Test
	public void findByProjection_1() {
		List<Object> list = empService.findByProjection_1();
		if (list != null) {
			for (Object object : list) {
				System.err.println(object);
			}
		}
	}

	// 使用数组的形式进行查询
	@Test
	public void findByProjection_2() {
		List<Object[]> list = empService.findByProjection_2();
		if (list != null) {
			for (Object[] object : list) {
				System.err.println(object[0] + "\t" + object[1]);
			}
		}
	}
}
