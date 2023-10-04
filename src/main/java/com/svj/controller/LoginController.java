package com.svj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svj.model.LoginModel;
import com.svj.service.ILoginService;

@RestController
@RequestMapping("api/")
public class LoginController {
	@Autowired
	ILoginService service;

	@PostMapping("/savecredentials")
	public ResponseEntity<String> saveLoginData(@RequestBody LoginModel loginModel) {
		String loginMsg = service.saveLoginData(loginModel);
		return new ResponseEntity<String>(loginMsg, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginSucess(@RequestBody Map<String, String> credentials){
		String username=credentials.get("username");
		String password=credentials.get("password");
		String model=service.login(username, password);
		return new ResponseEntity<String>(model,HttpStatus.OK);
	}
	
}
