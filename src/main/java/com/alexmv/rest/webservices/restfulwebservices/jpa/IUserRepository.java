package com.alexmv.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexmv.rest.webservices.restfulwebservices.user.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
