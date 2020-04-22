package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	private JdbcTemplate jt;
	
	

	@Override
	public List<Login> display() {
		
		String query = "select * from login";
		return jt.query(query, (rs, rowNum) -> new Login(rs.getString(1),rs.getString(2), rs.getString(3)));
	}



	@Override
	public boolean check(Login login) {
		List<Login> ls=display();
		for(Login lg:ls) {
			if((lg.getUserName().equals(login.getUserName())) && (lg.getPassword().equals(login.getPassword()))) {
				return true;
			}
		}
		return false;

	}

}

