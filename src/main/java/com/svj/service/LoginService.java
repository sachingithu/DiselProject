package com.svj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svj.exceptions.UsernameNotFoundException;
import com.svj.model.LoginModel;
import com.svj.repo.ILoginRepo;

@Service
public class LoginService implements ILoginService {
	@Autowired
	ILoginRepo repo;
	@Override
	public String saveLoginData(LoginModel loginModel) {
		LoginModel saveLogin=repo.save(loginModel);
		return "Saved login data with id "+saveLogin.getlId();
	}
	@Override
	public String login(String userName, String password) {
		Optional<LoginModel> opt=repo.findByUserNameAndPassword(userName,password);
		if(opt.isPresent()) {
			LoginModel model=opt.get();
			if(model.getUserName().equals(model.getUserName())&& model.getPassword().equals(model.getPassword())) {
				return "Login Succesfull ";
			}
		}
		throw new UsernameNotFoundException("Username or Password not found");
	}
	
}
