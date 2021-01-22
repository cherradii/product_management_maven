package com.cherradi.ensah.dao;

import java.util.List;

import com.cherradi.ensah.entities.User;

public interface IUserDAO {
	
	public List<User> getAllUsers();
	public List<User> getUsersByRoleName(String roleName);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long idUser);

}
