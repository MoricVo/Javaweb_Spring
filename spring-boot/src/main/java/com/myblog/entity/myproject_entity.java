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


@Entity
@Table(name="tab_myproject")
public class myproject_entity extends base_entity {



//Quan hệ giữa project và user
@ManyToOne
@JoinColumn(name = "id_user")
private user_entity user;
/////////////////////////////
@Column(name="name_project")
private String name_project;

@Column(name="description")
private String description;

@Column(name="use_technology")
private String use_tech;

@Column(name="member_join")
private String member;




public String getName_project() {
	return name_project;
}

public void setName_project(String name_project) {
	this.name_project = name_project;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getUse_tech() {
	return use_tech;
}

public void setUse_tech(String use_tech) {
	this.use_tech = use_tech;
}

public String getMember() {
	return member;
}

public void setMember(String member) {
	this.member = member;
}






public user_entity getUser() {
	return user;
}

public void setUser(user_entity user) {
	this.user = user;
}



}
