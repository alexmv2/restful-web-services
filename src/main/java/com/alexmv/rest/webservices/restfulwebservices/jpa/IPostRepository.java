package com.alexmv.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexmv.rest.webservices.restfulwebservices.user.Post;

public interface IPostRepository extends JpaRepository<Post, Integer>{

}
