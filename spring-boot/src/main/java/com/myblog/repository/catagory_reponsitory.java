package com.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myblog.entity.catagory_entity;
@Repository
public interface catagory_reponsitory extends JpaRepository<catagory_entity,Integer>
{
	catagory_entity findOneById(int id);
}