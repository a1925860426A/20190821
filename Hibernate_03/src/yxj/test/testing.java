package yxj.test;

import org.junit.Test;

import yxj.entity.player;
import yxj.service.playService;

public class testing {

	playService playerService = new playService();
	
	@Test
	public void save(){
		player play = new player();
		play.setNAME("���о�");
		play.setSEX("��");
		play.setADDRESS("����������");
	    play.setHOBBIES("����");
	    playerService.save(play);
	}
}
