package com.denis.spring.hibernate_mvc_crud.service;

import com.denis.spring.hibernate_mvc_crud.model.User;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void save(User user);
    public User show(int id);

    public void update(int id, User updatedUser);

    public void delete(int id);
}
