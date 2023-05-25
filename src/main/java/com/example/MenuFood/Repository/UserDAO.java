package com.example.MenuFood.Repository;

import com.example.MenuFood.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {


}
