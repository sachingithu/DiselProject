package com.svj.model;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class LoginModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lId;
	private String userName;
	private String password;
	public LoginModel() {
		super();
	}
	public LoginModel(Integer lId, String userName, String password) {
		super();
		this.lId = lId;
		this.userName = userName;
		this.password = password;
	}
	public Integer getlId() {
		return lId;
	}
	public void setlId(Integer lId) {
		this.lId = lId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginModel [lId=" + lId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
