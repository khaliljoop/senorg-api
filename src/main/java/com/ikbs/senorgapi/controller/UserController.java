package com.ikbs.senorgapi.controller;

import com.ikbs.senorgapi.entities.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api",produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @GetMapping()
    List<Object> search(){
        return List.of(new User(1,"joop","ibou",1));
    }
}
