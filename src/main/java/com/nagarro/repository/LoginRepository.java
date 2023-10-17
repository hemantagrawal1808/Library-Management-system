package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.nagarro.entity.User;


@Repository
public interface LoginRepository  extends JpaRepository<User, String>{

    User findByUsernameAndPassword(String username, String password);

}
