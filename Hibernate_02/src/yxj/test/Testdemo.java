package yxj.test;

import org.junit.Test;

import yxj.entity.Users;
import yxj.service.UserService;

public class Testdemo {

	UserService userService = new UserService();

	@Test
	public void saveTest() {
		Users user = new Users();
		user.setUsername("π∑");
		user.setPassword("123123123");
		userService.save(user);
	}

	@Test
	public void getTest() {
		Users user = userService.get(2);
		System.err.println(user.getUsername());
	}

	@Test
	public void deleteTest() {
		userService.delete(10);
	}

	@Test
	public void updateTest() {
		Users user = new Users();
		user.setId(7);
		user.setUsername("¡ı”Ó¿Ÿ");
		user.setPassword("1925");
		userService.update(user);
	}
}
