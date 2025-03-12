package com.signup.signup.controller;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.signup.signup.entity.Users;
import com.signup.signup.request.LoginRequest;
import com.signup.signup.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // @PostMapping("/addUser")
    // public Users addUser(@RequestBody Users user) {
    // return userService.addUser(user);
    // }

    // @GetMapping("/getAllUsers")
    // public List<Users> getAllUsers() {
    // return userService.getAllUsers();
    // }

    // @PostMapping("/updateUser")
    // public Users updateUser(@RequestBody Users user) {
    // return userService.updateUser(user);
    // }

    // @GetMapping("/deleteUser/{email}")
    // public boolean deleteUser(@PathVariable String email) {
    // return userService.deleteUser(email);
    // }

    // frontend will send data here(signup)

    @PostMapping("/signup")
    @CrossOrigin(origins = "http://localhost:5173/")
    public Users signup(@RequestBody Users user) {
        return userService.signup(user);
    }

    // for login since we will only have email and password so we can't use the
    // requestBody of Users since it has more fields. For that we will create a
    // request package which will handle all requests one is login request.

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:5173/")   
    public Boolean login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }

}