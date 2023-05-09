package com.rit.controller;


import com.rit.dto.UserDto;
import com.rit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<?> login(@RequestBody UserDto userDto){

       return userService.login(userDto);

    }
}
