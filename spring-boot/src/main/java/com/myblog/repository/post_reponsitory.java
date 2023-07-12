package com.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myblog.entity.post_entity;

public interface post_reponsitory extends JpaRepository<post_entity,Integer>
{
  
	
	
}
