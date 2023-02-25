package com.user.username.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.username.entity.UserName;

public interface UserNameRepo extends MongoRepository<UserName,String>{

    
}
