package com.registerForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerForm.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{

}
