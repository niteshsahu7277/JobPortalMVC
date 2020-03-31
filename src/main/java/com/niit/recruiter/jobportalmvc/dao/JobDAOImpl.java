package com.niit.recruiter.jobportalmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.recruiter.jobportalmvc.model.Job;

@Repository
public class JobDAOImpl implements JobDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Job> getJobList() {
		Session currentSession=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=currentSession.getCriteriaBuilder();
		CriteriaQuery<Job> cq=cb.createQuery(Job.class);
		Root<Job> root=cq.from(Job.class);
		cq.select(root);
		Query query=currentSession.createQuery(cq);
		return query.getResultList();
	}

}
