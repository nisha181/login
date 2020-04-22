package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Login;

public interface LoginService {
	public List<Login> display();
	public boolean check(Login login);
}
