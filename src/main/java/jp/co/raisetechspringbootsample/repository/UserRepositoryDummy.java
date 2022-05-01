package jp.co.raisetechspringbootsample.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.raisetechspringbootsample.domain.User;

@Component
public class UserRepositoryDummy {

	public List<User> findAll() {
		User user = new User();
		user.setId(0);
		user.setName("てっくん");
		user.setAge("秘密");
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		return userList;
		// DB処理を書く
	}

}
