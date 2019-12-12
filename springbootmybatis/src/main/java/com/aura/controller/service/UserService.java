package com.aura.controller.service;

import com.aura.controller.entity.User;
import com.aura.controller.mapepr.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   @Autowired
   public UserMapper userMapper;

   public List<User> findByName(String name) {
      return userMapper.findUserByName(name);
   }

   public User insertUser(User user) {
      userMapper.insertUser(user);
      return user;
   }
   public List<User> ListUser(){
      return userMapper.ListUser();
   }
   
   
   public int Update(User user){
      return userMapper.Update(user);
   }
   
   public int delete(int id){
      return userMapper.delete(id);
   }
}