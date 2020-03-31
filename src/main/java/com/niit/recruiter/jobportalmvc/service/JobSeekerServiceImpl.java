package com.niit.recruiter.jobportalmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.recruiter.jobportalmvc.dao.JobSeekerDAO;
import com.niit.recruiter.jobportalmvc.model.JobSeeker;


@Service
public class JobSeekerServiceImpl implements JobSeekerService {

	@Autowired
	private JobSeekerDAO jobSeekerDAO;
	@Transactional
	@Override
	public void saveJobSeeker(JobSeeker theJobSeeker) {
		jobSeekerDAO.saveJobSeeker(theJobSeeker);
	}

	/*
	 * @Override public JobSeeker getJObSeeker(String email, String password) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * @Override
	 * 
	 * @Transactional public JobSeeker checkJobSeeker(JobSeeker theJobSeeker) {
	 * 
	 * return jobSeekerDAO.checkJobSeeker(theJobSeeker);
	 * 
	 * }
	 */
}
