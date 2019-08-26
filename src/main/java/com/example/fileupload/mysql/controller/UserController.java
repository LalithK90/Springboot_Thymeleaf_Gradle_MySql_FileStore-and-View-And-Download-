package com.example.fileupload.mysql.controller;

import com.example.fileupload.mysql.model.User;
import com.example.fileupload.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping( "/user" )
    public String  save() {
        User sample = new User("Asanka");
        userRepository.save(sample);
        return "save";
    }

    @GetMapping( "/user1" )
    public String  update() {
        User sample = userRepository.getOne((long) 1);
        sample.setName("Lalith");
        userRepository.save(sample);
        return "save";
    }
}
