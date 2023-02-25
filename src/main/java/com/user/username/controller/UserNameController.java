package com.user.username.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.username.dto.UserNameDto;
import com.user.username.service.UserNameService;

@RestController
@RequestMapping("/username")
public class UserNameController {
    
    @Autowired
    UserNameService userNameService;

    @PostMapping
    UserNameDto createUserName(@RequestBody UserNameDto userNameDto){
        return this.userNameService.createUserName(userNameDto);
    }

    @GetMapping
    List<UserNameDto> getAllUserName(){
       return this.userNameService.getAllUserName();
    }
}
