package com.niit.recruiter.jobportalmvc.dao;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.recruiter.jobportalmvc.model.LoginUsers;

@Repository
public class LoginUsersDAOImpl implements LoginUsersDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public LoginUsers checkUsers(LoginUsers theLoginUsers) {
		LoginUsers loginUsers=null;
		try {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<LoginUsers> cq=cb.createQuery(LoginUsers.class);
		Root<LoginUsers> root=cq.from(LoginUsers.class);
		cq.select(root).where(cb.equal(root.get("password"), theLoginUsers.getPassword()),
		cb.equal(root.get("email"),theLoginUsers.getEmail() ));
		Query query=session.createQuery(cq);
		query.setMaxResults(1);
		loginUsers=(LoginUsers)query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		return loginUsers;
		
	}

}
