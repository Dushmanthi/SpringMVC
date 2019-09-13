package com.xyz.springmvc.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xyz.springmvc.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException{
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	 
	 public void addUser(User user) {
		 
	 }


	public List<User> ListAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
