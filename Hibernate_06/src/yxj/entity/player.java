package yxj.entity;

/**
 * 玩家类
 * @author yxj
 * 
 */
public class player {

	private int ID;//玩家编号
	private String NAME;//玩家名称
	private String SEX;//玩家性别
	private String ADDRESS;//玩家地址
	private String HOBBIES;//玩家爱好
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getHOBBIES() {
		return HOBBIES;
	}
	public void setHOBBIES(String hOBBIES) {
		HOBBIES = hOBBIES;
	}
}
