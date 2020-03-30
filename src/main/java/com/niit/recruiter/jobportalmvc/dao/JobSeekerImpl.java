package com.niit.recruiter.jobportalmvc.dao;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.recruiter.jobportalmvc.model.JobSeeker;

@Repository
public class JobSeekerImpl implements JobSeekerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveJobSeeker(JobSeeker theJobSeeker) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theJobSeeker);

	}

	@Override
	public JobSeeker getJobSeeker(String email,String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public JobSeeker checkJobSeeker(JobSeeker theJobSeeker) {
		JobSeeker jobSeeker=null;
		Session session=null;
		try {
			session=sessionFactory.getCurrentSession();
			CriteriaBuilder cb=session.getCriteriaBuilder();
			CriteriaQuery<JobSeeker> cq=cb.createQuery(JobSeeker.class);
			Root<JobSeeker> root=cq.from(JobSeeker.class);
			cq.select(root).where(cb.equal(root.get("email"),theJobSeeker.getEmail()),
					cb.equal(root.get("password"),theJobSeeker.getPassword()));
			
			Query query=session.createQuery(cq);
			query.setMaxResults(1);
			jobSeeker=(JobSeeker)query.getSingleResult();	
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		return jobSeeker;
		
	}

}
