package com.example.gcp.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.example.gcp.demo.model.User;
import com.googlecode.objectify.ObjectifyService;

@WebListener
public class ObjectifyWebListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent event) {
    ObjectifyService.begin();
    // This is a good place to register your POJO entity classes.
    // ObjectifyService.register(YourEntity.class);
    
    ObjectifyService.register(User.class);
  }

  @Override
  public void contextDestroyed(ServletContextEvent event) {
  }
}