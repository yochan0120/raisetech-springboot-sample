package jp.co.raisetechspringbootsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.raisetechspringbootsample.domain.User;
import jp.co.raisetechspringbootsample.service.UserService;

//import jp.co.raisetechspringbootsample.service.UserService;

@Controller
public class TopController {

//	todo: add service by DI
	@Autowired
	UserService userService;

	@GetMapping
	public String index(Model m) { // Modelを使うとTymeleafのhtml側に値を渡す

		m.addAttribute("message", "wasshoi");

		// ユーザーDB情報を取得
		List<User> userList = userService.getUsers();
		System.out.println(userList);
		m.addAttribute(userList); // "message"という名のmessageStringを渡す
//		m.addAttribute("userList", "userList"); 　//同じ意味 usetListに名前を付けるならこっち

		return "index";
	}

}
