package com.myblog.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myblog.convert.post_convert;
import com.myblog.dto.post_dto;
import com.myblog.entity.catagory_entity;
import com.myblog.entity.post_entity;
import com.myblog.entity.user_entity;
import com.myblog.repository.catagory_reponsitory;
import com.myblog.repository.post_reponsitory;
import com.myblog.repository.user_reponsitory;
import com.myblog.service.I_post_service;
@Service
public class post_service implements I_post_service{

	@Autowired
	private post_reponsitory post_Responsitory;
    @Autowired 
    private catagory_reponsitory catagory_Reponsitory; 
    @Autowired 
    private user_reponsitory user_Reponsitory; 
    @Autowired 
    private post_convert post_Convert;
	@Override
	public post_dto save(post_dto post_Dto) {
		post_entity post_Entity=new post_entity();
		if(post_Dto.getId()!=0)
		{
			post_entity old_post=post_Responsitory.findOne(post_Dto.getId());
		    post_Entity=post_Convert.toEntity(post_Dto, old_post);
		}
		else
		{
			 post_Entity= post_Convert.toEntity(post_Dto);
			
			
		}
		catagory_entity catagory_Entity=catagory_Reponsitory.findOneById(post_Dto.getId_catagory());
		user_entity user_Entity=user_Reponsitory.findOneById(post_Dto.getId_user());
		post_Entity.setCategory(catagory_Entity);
		post_Entity.setUser(user_Entity);
		post_Entity=post_Responsitory.save(post_Entity);
		return post_Convert.toDto(post_Entity);
		
		
		
	}
	@Override
	public post_dto update(post_dto Dto) {
	
	
		return null;
	}
	@Override
	public void delete(int[] ids) {
	  for (int item : ids)
	{
	   post_Responsitory.delete(item);	
	}
		
	}
}
