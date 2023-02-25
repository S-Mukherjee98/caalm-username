package com.user.username.service;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.username.dto.UserNameDto;
import com.user.username.entity.UserName;
import com.user.username.repository.UserNameRepo;

@Service
public class UserNameService {

    @Autowired
    UserNameRepo userNameRepo;

    @Autowired
    ModelMapper modelMapper;
    
    public UserNameDto createUserName(UserNameDto userNameDto){
        
        UserName userName=this.modelMapper.map(userNameDto, UserName.class);
        
        UserName savedUserName= this.userNameRepo.save(userName);
        return this.modelMapper.map(savedUserName, UserNameDto.class);
    }

    public List<UserNameDto> getAllUserName(){
        List<UserName> userNames= this.userNameRepo.findAll();
        List<UserNameDto> userNameDtos= userNames.stream().map((user)->this.modelMapper.map(user, UserNameDto.class)).collect(Collectors.toList());
        return userNameDtos;
    }
}
