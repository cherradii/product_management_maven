package com.cherradi.ensah.test;

import java.util.ArrayList;
import java.util.List;

import com.cherradi.ensah.dao.IUserDAO;
import com.cherradi.ensah.dao.ImpUserDAO;
import com.cherradi.ensah.entities.User;

public class TestUserDAO {
	
	
	public static void main(String[] args) {
		
		IUserDAO userDAO = new ImpUserDAO();

//		User user1 = new User("med1995cherradi@gmail.com", "123456", "admin", "true");
		User user2 = new User("mohamed.amine@gmail.com", "456789", "user", "true");
		
//		userDAO.addUser(user1);
//		userDAO.addUser(user2);
		
//		List<User> users = userDAO.getUsersByRoleName("user");
//		for (User user : users) {
//			System.out.println(user.getIdUser()+"---"+user.getLogin()+"---"+user.getPassword()+"---"+user.getRole()+"---"+user.getEnabled());
//		}
		
		
//		List<User> users = userDAO.getAllUsers();
//		for (User user : users) {
//			System.out.println(user.getIdUser()+"---"+user.getLogin()+"---"+user.getPassword()+"---"+user.getRole()+"---"+user.getEnabled());
//		}
//		
		
//		userDAO.addUser(new User("aa", "bb", "cc", "dd"));
//		userDAO.deleteUser((long) 3);
		
//		user2.setLogin("tarik.boudaa@gmail.com");
//		userDAO.updateUser(user2);

		
		
	}

}
