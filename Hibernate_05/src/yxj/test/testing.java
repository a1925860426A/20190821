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
	//增加方法
	public void addPlayer() {
		player play = new player();
		play.setNAME("狗子");
		play.setSEX("它");
		play.setADDRESS("流浪街头");
		play.setHOBBIES("吃垃圾");
		playService.save(play);
	}
	
	@Test
	public void findPlayBy_Id() {
		player play = playService.findPlayBy_Id(2);
		System.err.println(play.getHOBBIES());
	}
}
