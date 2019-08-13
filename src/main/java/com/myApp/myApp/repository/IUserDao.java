package com.myApp.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myApp.myApp.dto.TbUser;

public interface IUserDao extends JpaRepository<TbUser, String> {

}
