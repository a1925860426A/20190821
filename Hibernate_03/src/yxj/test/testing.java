package yxj.test;

import org.junit.Test;

import yxj.entity.player;
import yxj.service.playService;

public class testing {

	playService playerService = new playService();
	
	@Test
	public void save(){
		player play = new player();
		play.setNAME("杨行军");
		play.setSEX("男");
		play.setADDRESS("北京海淀区");
	    play.setHOBBIES("足球");
	    playerService.save(play);
	}
}
