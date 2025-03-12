package com.signup.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.signup.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    Users findByEmail(String email); // here in JpaRepository, the first parameter is the entity class and the second
                                     // parameter is the type of the primary key of that entity class

}
