package com.svj.exceptions;

public class UsernameNotFoundException extends RuntimeException {
	public UsernameNotFoundException(){
		super();
	}
	public UsernameNotFoundException(String msg){
		super(msg);
	}
}
