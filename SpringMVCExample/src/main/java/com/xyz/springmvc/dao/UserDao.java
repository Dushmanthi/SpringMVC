package com.xyz.springmvc.dao;
import com.xyz.springmvc.model.User;
import java.util.List;

public interface UserDao {
 public List<User> ListAllUsers();
 
 public void addUser(User user);
 
 
}
