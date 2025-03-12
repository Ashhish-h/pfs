package com.signup.signup.service;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.signup.signup.entity.Users;
import com.signup.signup.repository.UsersRepository;
import com.signup.signup.request.LoginRequest;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    // // service for adding user
    // public Users addUser(Users user) {
    // return usersRepository.save(user);
    // }

    // // service for getting all users
    // public List<Users> getAllUsers() {
    // return usersRepository.findAll();
    // }

    // // service for updating user
    // public Users updateUser(Users updatedUser) {
    // Users existingUser = usersRepository.findByEmail(updatedUser.getEmail());
    // if (existingUser != null) {
    // existingUser.setName(updatedUser.getName());
    // existingUser.setPassword(updatedUser.getPassword());
    // return usersRepository.save(existingUser);
    // } else {
    // return null;
    // }
    // }

    // // service for deleting user
    // public boolean deleteUser(String email) {
    // Users existingUser = usersRepository.findByEmail(email);
    // usersRepository.delete(existingUser);
    // return true;
    // }

    // service for signing up
    public Users signup(Users user) {
        return usersRepository.save(user);
    }

    public Boolean login(LoginRequest loginRequest) {
        Users existingUser = usersRepository.findByEmail(loginRequest.getEmail());
        if (existingUser != null) {
            if (existingUser.getPassword().trim().equals(loginRequest.getPassword().trim())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
