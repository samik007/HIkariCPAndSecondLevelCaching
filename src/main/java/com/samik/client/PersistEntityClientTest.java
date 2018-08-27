package com.samik.client;

import com.samik.dao.UserDAO;
import com.samik.entity.User;

public class PersistEntityClientTest {
	public static void main(String[] args) {

		UserDAO userDAO = new UserDAO();
		User user = getUser();
		userDAO.createUser(user);
		userDAO.getUser();
	}

	private static User getUser() {
		User user = new User();
		user.setFirstName("Sean");
		user.setLastName("Murphy");
		return user;
	}
}
