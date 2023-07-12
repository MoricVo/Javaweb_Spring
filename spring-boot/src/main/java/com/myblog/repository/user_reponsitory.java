package com.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myblog.entity.user_entity;

public interface user_reponsitory  extends JpaRepository<user_entity,Integer> {
	user_entity findOneById(int id);
}
