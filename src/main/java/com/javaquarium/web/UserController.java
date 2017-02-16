package com.javaquarium.web;

import com.javaquarium.domain.User;
import com.javaquarium.repository.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2016/8/20.
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserReposity userReposity;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> findAll() {
    List<User> list=userReposity.findAll();
        return list;
        }
}
