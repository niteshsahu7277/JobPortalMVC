package com.niit.recruiter.jobportalmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.recruiter.jobportalmvc.model.JobSeeker;
import com.niit.recruiter.jobportalmvc.service.JobSeekerService;



@Controller
@RequestMapping("/jobseeker") 
public class JobSeekerController {
	
	
	
	@Autowired
	private JobSeekerService jobSeekerService;
	@RequestMapping(value="/showRegisterForm")    //@RequestMapping using in the method level ,it has default GET method
	public String showFormForAdd(ModelMap theModel)
	{
		JobSeeker theJobSeeker=new JobSeeker();
		theModel.addAttribute("jobseeker", theJobSeeker);
		return "register";  //return model + view name
	}
	@PostMapping(value="/saveJobSeeker")    
	public String saveCustomer(@ModelAttribute("jobseeker") JobSeeker theJobSeeker)
	{
		jobSeekerService.saveJobSeeker(theJobSeeker);
		return "success";  
	}
	@RequestMapping(value="showLoginForm")    //@RequestMapping using in the method level ,it has default GET method
	public String showLoginForm(ModelMap theModel)
	{
		JobSeeker theJobSeeker=new JobSeeker();
		theModel.addAttribute("jobseeker", theJobSeeker);
		return "login-jobseeker"; 
	}
	
	@RequestMapping(value="loginJobSeeker",method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute JobSeeker theJobSeeker) {
		ModelAndView model=null;
		JobSeeker jobseeker=jobSeekerService.checkJobSeeker(theJobSeeker);
		if(jobseeker==null) {
			System.out.println("jobseeker "+jobseeker);
			model=new ModelAndView("login-jobseeker");
			model.addObject("error","Invalid User Name Or Password");
			model.addObject("jobseeker", new JobSeeker());
		}
		else {
			model=new ModelAndView("welcome");
			model.addObject("jobseeker", jobseeker);
		}
		return model;
	}


}
