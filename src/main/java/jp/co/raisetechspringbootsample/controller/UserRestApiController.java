package jp.co.raisetechspringbootsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.raisetechspringbootsample.domain.User;
import jp.co.raisetechspringbootsample.service.UserService;

@RestController
public class UserRestApiController {
//	todo: add service by DI
	@Autowired
	UserService userService;

	@GetMapping("/api")
	public List<User> getUsers() { // Modelを使うとTymeleafのhtml側に値を渡す

		// ユーザー情報取得
		List<User> userList = userService.getUsers();
		// m.addAttribute(userList); // "message"という名のmessageStringを渡す
//		m.addAttribute("userList", "userList"); 　//同じ意味 usetListに名前を付けるならこっち

		return userList;
	}
}
