package com.example.accessmysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.accessmysql.model.User;

// SpringBoot creates at run-time
//BEAN is a Spring - Managed POJO (Object)
public interface UserRepository extends CrudRepository<User, Integer> {

	
	
}
