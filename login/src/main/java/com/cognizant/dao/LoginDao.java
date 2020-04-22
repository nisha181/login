package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Login;

public interface LoginDao {
public List<Login> display();
public boolean check(Login login);
}
