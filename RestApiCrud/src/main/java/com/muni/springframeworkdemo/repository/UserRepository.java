package com.muni.springframeworkdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muni.springframeworkdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
