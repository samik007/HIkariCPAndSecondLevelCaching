package com.samik.dao;

import org.hibernate.Session;

import com.samik.entity.User;
import com.samik.util.HibernateUtil;

public class UserDAO {
	public void createUser(User user) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getUser() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			User user = (User)session.get(User.class,1L);
			System.out.println(user.getFirstName());
			
			Session session2 = HibernateUtil.getSessionFactory().openSession();
			session2.beginTransaction();
			User user1 = (User)session2.get(User.class,1L);
			System.out.println(user1.getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
