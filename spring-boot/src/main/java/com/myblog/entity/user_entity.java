package com.myblog.entity;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="tab_user")
public class user_entity extends base_entity {

//Người dùng và dự án
@OneToMany(mappedBy = "user")
private List<myproject_entity> myprojects = new ArrayList<>();
//Người dùng và bài viết
@OneToMany(mappedBy = "user")
private List<post_entity> posts = new ArrayList<>();

@Column(name="name_user")
private String name_user;

@Column(name="number_user")
private String number_user;

@Column(name="address")
private String address;

@Column(name="gmail")
private String gmail;

@Column(name="password")
private String password;

@Column(name="status")
private int status;






public String getName_user() {
	return name_user;
}

public void setName_user(String name_user) {
	this.name_user = name_user;
}

public String getNumber_user() {
	return number_user;
}

public void setNumber_user(String number_user) {
	this.number_user = number_user;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getGmail() {
	return gmail;
}

public void setGmail(String gmail) {
	this.gmail = gmail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}



public List<myproject_entity> getMyprojects() {
	return myprojects;
}

public void setMyprojects(List<myproject_entity> myprojects) {
	this.myprojects = myprojects;
}

public List<post_entity> getPosts() {
	return posts;
}

public void setPosts(List<post_entity> posts) {
	this.posts = posts;
}



}
