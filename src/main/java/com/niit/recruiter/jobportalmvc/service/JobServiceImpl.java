package com.niit.recruiter.jobportalmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.recruiter.jobportalmvc.dao.JobDAO;
import com.niit.recruiter.jobportalmvc.model.Job;
@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	private JobDAO jobDAO;
	
	@Override
	@Transactional
	public List<Job> getJobList() {
	
		return jobDAO.getJobList();
	}

}
