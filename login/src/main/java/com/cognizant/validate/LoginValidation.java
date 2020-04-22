package com.cognizant.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.model.Login;


@Component
public class LoginValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Login login = (Login)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "","Username is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "", "Password is empty");
		if (login.getUserName().length()<5) {
			errors.rejectValue("userName","", "Username length is less than 5");
		}
		
		String x="^(?=.*[0-9]).{8,15}$";
		if(login.getPassword().matches(x)==false) {
			errors.rejectValue("password","","Invalid Format");
		}
		
	}

}
