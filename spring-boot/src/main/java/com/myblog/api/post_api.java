package com.myblog.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myblog.dto.post_dto;
import com.myblog.service.I_post_service;
@CrossOrigin
@RestController   //Restcontroller=Controller+ResponseBody
public class post_api {
	@Autowired
	I_post_service post_service;
	
	 @PostMapping(value="/post")//PostMapping=RequestMapping+method

     @ResponseBody
     //Khi client gửi JSON về server thì RequestBody nhận chuổi JSON và convert
     //về định dạng dữ liệu theo đúng định dạng trên lớp và ngược lại sẽ dùng ResponseBody

     public post_dto createNew(@RequestBody post_dto model) {

             return post_service.save(model);

     }
	 
	 
////////////////////////////////////////////////////////////////////////////////	 
	 @PutMapping(value="/post/{id}")

     @ResponseBody
    
     public post_dto updateNew(@RequestBody post_dto model,@PathVariable("id") int id) {
            model.setId(id);
             return post_service.save(model);

     }
	 
////////////////////////////////////////////////////////////////////////////////
	@DeleteMapping(value="/post")
	
	@ResponseBody
	
	public void deleteNew(@RequestBody int ids[]) {
	
	    post_service.delete(ids);

    }
////////////////////////////////////////////////////////////////////////////////
	@GetMapping(value="/post")
	
	@ResponseBody
	
	public post_dto getNew(@RequestBody post_dto model) {
	
	return model;
	
	}
}
