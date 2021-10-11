package com.service.data;

import java.util.List;

import com.service.pojo.User;

public interface IUserData {
	public Boolean createUser(User user);
	public Boolean updateUser(User user);
	public Boolean deleteUser(Integer id);
	public List<User> getUsersByName(String name); 
	public List<User> getUsers(); 
	public User getUser(Integer id);
	

}
