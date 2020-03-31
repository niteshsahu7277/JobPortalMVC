package com.niit.recruiter.jobportalmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.recruiter.jobportalmvc.dao.ApplicationDAO;

import com.niit.recruiter.jobportalmvc.model.Application;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationDAO applicationDAO; 
	
	@Override
	@Transactional
	public void saveApplication(Application theApplication) {
		applicationDAO.saveApplication(theApplication);
	}

}
