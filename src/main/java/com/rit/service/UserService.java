package com.rit.service;

import com.rit.domain.User;
import com.rit.dto.UserDto;
import com.rit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public ResponseEntity<?> login(UserDto userDto) {
        Map<String, String> map = new HashMap<>();
        User user = userRepository.findByuserNameAndPassword(userDto.getUserName(), userDto.getPassword());
        if (user == null){
            map.put("message", "please enter valid details");
        }else {
            map.put("message", "login successfully");
        }
        return ResponseEntity.ok(map);
    }
}
