package com.myblog.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="tab_post")
public class post_entity extends base_entity {


//Danh mục và bài viết
@ManyToOne
@JoinColumn(name = "id_catagory")
private catagory_entity catagory;
//Người dùng và bài viết
@ManyToOne
@JoinColumn(name = "id_user")
private user_entity user;

@Column(name="name_post")
private String name_post;

@Column(name="description")
private String description;

@Column(name="image")
private String image;

@Column(name="summary")
private String summary;






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







public catagory_entity getCategory() {
	return catagory;
}

public void setCategory(catagory_entity category) {
	this.catagory = category;
}

public user_entity getUser() {
	return user;
}

public void setUser(user_entity user) {
	this.user = user;
}



}
