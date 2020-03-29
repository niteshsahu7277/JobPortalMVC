package com.niit.recruiter.jobportalmvc.service;

import com.niit.recruiter.jobportalmvc.model.JobSeeker;

public interface JobSeekerService {
	public void saveJobSeeker(JobSeeker theJobSeeker);
	public JobSeeker getJObSeeker(String email,String password);
	public JobSeeker checkJobSeeker(JobSeeker theJobSeeker);

}
