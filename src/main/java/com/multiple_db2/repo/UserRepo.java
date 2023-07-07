package com.multiple_db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiple_db2.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
