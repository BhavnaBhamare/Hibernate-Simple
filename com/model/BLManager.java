package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Emplyoee;

public class BLManager {

	SessionFactory sf =new Configuration().configure().buildSessionFactory();

	public void saveEmp(Emplyoee e) {
		// TODO Auto-generated method stub
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
	}

	public List<Emplyoee> getAllEmp()
	{
		Session s=sf.openSession();
		Criteria cr=s.createCriteria(Emplyoee.class);
		@SuppressWarnings("unchecked")
		List<Emplyoee> e=cr.list();
		return e;
		
	}
	public Emplyoee serchById(int id) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Emplyoee.class);
		cr.add(Restrictions.eq("id", id));
		Emplyoee e=(Emplyoee)cr.uniqueResult();
		return e;
	}
	public void deleteRecords(Emplyoee e) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(e);
		t.commit();
		s.close();
	}

	public void updateRecords(Emplyoee e) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(e);
		t.commit();
		s.close();
	}
	

}
