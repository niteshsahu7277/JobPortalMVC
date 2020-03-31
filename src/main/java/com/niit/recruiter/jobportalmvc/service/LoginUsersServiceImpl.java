package com.niit.recruiter.jobportalmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.recruiter.jobportalmvc.dao.LoginUsersDAO;
import com.niit.recruiter.jobportalmvc.model.LoginUsers;


@Service
public class LoginUsersServiceImpl implements LoginUsersService {
	
	@Autowired
	private LoginUsersDAO loginUsersDAO;
	
	@Override
	@Transactional
	public LoginUsers checkUsers(LoginUsers theLoginUsers) {
		
		return loginUsersDAO.checkUsers(theLoginUsers);
	}

}
