package com.svj.service;

import java.util.Optional;

import com.svj.model.LoginModel;

public interface ILoginService {
	public String saveLoginData(LoginModel loginModel);
	public String login(String userName,String password);
}
