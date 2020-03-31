package com.niit.recruiter.jobportalmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.recruiter.jobportalmvc.model.Application;

@Repository
public class ApplicationDAOImpl implements ApplicationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveApplication(Application theApplication) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(theApplication);
	}

}
