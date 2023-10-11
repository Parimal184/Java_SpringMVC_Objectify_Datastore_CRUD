package com.example.gcp.demo.dao;

import com.example.gcp.demo.model.User;
import com.googlecode.objectify.ObjectifyService;

public class UserDAO {
	
	public void save(User user) {
		ObjectifyService.ofy().save().entity(user).now();
	}
	
}
