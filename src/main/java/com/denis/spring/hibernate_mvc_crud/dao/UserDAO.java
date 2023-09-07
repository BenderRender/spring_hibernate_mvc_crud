package com.denis.spring.hibernate_mvc_crud.dao;

import com.denis.spring.hibernate_mvc_crud.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void save(User user);
    public User show(int id);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
