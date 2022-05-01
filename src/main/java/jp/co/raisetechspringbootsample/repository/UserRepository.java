package jp.co.raisetechspringbootsample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.raisetechspringbootsample.domain.User;

@Mapper
public interface UserRepository {
//	interdaceなので、処理は書かない

	// DB処理（SELECT文 テーブルからデータを持ってくる）
	@Select("SELSCT * FROM user")
	public List<User> findAll();

}
