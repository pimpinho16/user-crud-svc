package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.entity.SvcUsrUser;

public interface UserRepository extends JpaRepository<SvcUsrUser, Integer>{

}
