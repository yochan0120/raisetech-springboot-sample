package jp.co.raisetechspringbootsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.raisetechspringbootsample.domain.User;
import jp.co.raisetechspringbootsample.repository.UserRepository;
import jp.co.raisetechspringbootsample.repository.UserRepositoryDummy;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserRepositoryDummy userRepositoryDummy;

	public List<User> getUsers() {
		return userRepositoryDummy.findAll();
	}

}
