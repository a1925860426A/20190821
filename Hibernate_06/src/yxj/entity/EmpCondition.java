package yxj.entity;

import java.util.Date;

/**
 * 员工查询对应的条件封装类
 * @author yxj
 *
 */
public class EmpCondition {

	private Date from;// 起始时间
	private Date to;// 结束事件
	private Date hireDate;//时间
	private String job;//职业
	private Integer money;//薪资

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

}
