package com.myblog.convert;

import org.springframework.stereotype.Component;

import com.myblog.dto.post_dto;
import com.myblog.entity.post_entity;

@Component
public class post_convert {
	public post_entity toEntity(post_dto dto) {
		post_entity entity=new post_entity();
		entity.setName_post(dto.getName_post());
		entity.setDescription(dto.getDescription());
		entity.setImage(dto.getImage());
		entity.setSummary(dto.getSummary());
		entity.setCreatedDate(dto.getCreateddate());
		entity.setCreatedBy(dto.getCreatedby());
		entity.setModifiedDate(dto.getModifieddate());
		entity.setModifiedBy(dto.getModifiedby());
		
		return entity;
	}
	public post_dto toDto(post_entity entity) {
		post_dto dto=new post_dto();
		if(entity.getId()!=0)
		{
			dto.setId(entity.getId());
		}

		dto.setName_post(entity.getName_post());
		dto.setDescription(entity.getDescription());
		dto.setImage(entity.getImage());
		dto.setSummary(entity.getSummary());
		dto.setCreateddate(entity.getCreatedDate());
		dto.setCreatedby(entity.getCreatedBy());
		dto.setModifieddate(entity.getModifiedDate());
		dto.setModifiedby(entity.getModifiedBy());
		
		return dto;
	}
	public post_entity toEntity(post_dto dto,post_entity entity) {
		entity.setName_post(dto.getName_post());
		entity.setDescription(dto.getDescription());
		entity.setImage(dto.getImage());
		entity.setSummary(dto.getSummary());
		entity.setCreatedDate(dto.getCreateddate());
		entity.setCreatedBy(dto.getCreatedby());
		entity.setModifiedDate(dto.getModifieddate());
		entity.setModifiedBy(dto.getModifiedby());
		
		return entity;
	}

}
