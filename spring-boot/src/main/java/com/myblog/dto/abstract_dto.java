package com.myblog.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class abstract_dto<T>
{
	private int id;
	private String createdby;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createddate;
	private String modifiedby;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifieddate;
	private List<T> listresult = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public List<T> getListresult() {
		return listresult;
	}
	public void setListresult(List<T> listresult) {
		this.listresult = listresult;
	}
	
	
	
	
	
	
    
}
