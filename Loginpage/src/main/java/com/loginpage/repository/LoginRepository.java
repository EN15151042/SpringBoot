package com.loginpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginpage.model.Login;

public interface LoginRepository extends JpaRepository<Login,Long> 
{
    Login findByUsernameAndPassword(String username,String password );

	//Login findByuseridandname(String username, String password);

}
