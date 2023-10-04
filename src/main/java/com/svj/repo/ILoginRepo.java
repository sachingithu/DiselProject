package com.svj.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.svj.model.LoginModel;

public interface ILoginRepo extends JpaRepository<LoginModel, Integer> {

	public Optional<LoginModel> findByUserNameAndPassword(String userName, String password);

}
