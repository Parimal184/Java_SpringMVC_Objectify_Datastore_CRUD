package com.example.gcp.demo.service;

import com.example.gcp.demo.dao.UserDAO;
import com.example.gcp.demo.model.User;

public class UserService {
	
	private UserDAO userDAO =  new UserDAO();
	
	public void saveUser(User user) {
		userDAO.save(user);
	}
}
