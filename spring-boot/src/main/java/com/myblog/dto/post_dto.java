package com.myblog.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class post_dto extends abstract_dto<post_dto>   {

private int id_catagory;
private int id_user;
private String name_post;
private String description;
private String image;
private String summary;


public int getId_catagory() {
	return id_catagory;
}
public void setId_catagory(int id_catagory) {
	this.id_catagory = id_catagory;
}

public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
}
public String getName_post() {
	return name_post;
}
public void setName_post(String name_post) {
	this.name_post = name_post;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}




}
