/**
 * 
 */
package yxj.test;

import org.junit.Test;

import yxj.entity.player;
import yxj.service.playerService;

/**
 * @author yxj
 *
 */
public class testing {

	playerService playService = new playerService();

	@Test
	//���ӷ���
	public void addPlayer() {
		player play = new player();
		play.setNAME("����");
		play.setSEX("��");
		play.setADDRESS("���˽�ͷ");
		play.setHOBBIES("������");
		playService.save(play);
	}
	
	@Test
	public void findPlayBy_Id() {
		player play = playService.findPlayBy_Id(2);
		System.err.println(play.getHOBBIES());
	}
}
