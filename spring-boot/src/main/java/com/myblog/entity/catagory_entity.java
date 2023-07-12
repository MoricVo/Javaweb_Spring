package com.myblog.entity;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="tab_catagory")
public class catagory_entity extends base_entity {

//Danh mục và bài viết
@OneToMany(mappedBy = "catagory")
private List<post_entity> posts = new ArrayList<>();

@Column(name="name_catagory")
private String name_catagory;



public String getName_catagory() {
	return name_catagory;
}

public void setName_catagory(String name_catagory) {
	this.name_catagory = name_catagory;
}


public List<post_entity> getPosts() {
	return posts;
}

public void setPosts(List<post_entity> posts) {
	this.posts = posts;
}


}
