package com.example.MenuFood.Service;

import com.example.MenuFood.Model.User;
import com.example.MenuFood.Repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> findAllUsers(){
        return userDAO.findAll();
    }


}
