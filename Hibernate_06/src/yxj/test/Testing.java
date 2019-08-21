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

	// ʹ��List�����������
	@Test
	public void findPlayerList() {
		List<player> list = playService.findPlayList();
		for (player play : list) {
			System.out.println(play.getNAME() + "\t" + play.getSEX() + "\t" + play.getHOBBIES());
		}
	}

	// ʹ��Iterator�����������
	@Test
	public void findPlayerIterator() {
		playService.findPlayIterator();
	}

	// ʹ�ò����±�󶨵���ʽ���в�ѯ1
	@Test
	public void findUserByName1() {
		List<player> list = playService.findPlayBy_Name1("���о�");
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// ʹ�ò����±�󶨵���ʽ���в�ѯ2
	@Test
	public void findUserByName2() {
		List<player> list = playService.findPlayBy_Name2("������");
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// ʹ���������ʽ���в�ѯ
	@Test
	public void findUserBy_Params() {
		Object[] params = { "������", "�٤" };
		List<player> list = playService.findPlayBy_Params(params);
		if (list != null) {
			for (player play : list) {
				System.out.println(play.getNAME() + "\t" + play.getHOBBIES());
			}
		}
	}

	// ʹ�ö�̬�ķ�ʽ��ѯ
	@Test
	public void findEmpCondition() throws ParseException {
		EmpCondition conditions = new EmpCondition();
		conditions.setJob("����");
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

	// ʹ�÷�ҳ��ѯ
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

	// ʹ�÷�װ��Object�������ʽ��ѯ
	@Test
	public void findByProjection_1() {
		List<Object> list = empService.findByProjection_1();
		if (list != null) {
			for (Object object : list) {
				System.err.println(object);
			}
		}
	}

	// ʹ���������ʽ���в�ѯ
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