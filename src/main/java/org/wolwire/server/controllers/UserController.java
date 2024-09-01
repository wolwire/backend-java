package org.wolwire.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wolwire.server.models.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();
    public UserController() {
        users.addAll(List.of(
                new User("Jane"),
                new User("Jane"),
                new User("John")
        ));
    }

    @GetMapping("")
    @ResponseBody
    public List<User> index(){
        return users;
    }
}
