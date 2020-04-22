package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.LoginDao;
import com.cognizant.model.Login;

@Service
public class LoginServiceImpl implements LoginService {

	
	@Autowired
	private LoginDao loginDao;


	@Override
	public List<Login> display() {
		return loginDao.display();
	}


	@Override
	public boolean check(Login login) {
		return loginDao.check(login);
	}

}
