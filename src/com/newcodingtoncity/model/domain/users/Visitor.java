package com.newcodingtoncity.model.domain.users;

public class Visitor extends User {

	public Visitor(int userId, String userName, String password,
			String firstName, String lastName, String dni, String email,
			String phoneNumber, String address) {
		super(userId, userName, password, firstName, lastName, dni, email, phoneNumber,
				address);
	}

	@Override
	public void viewEvents() {
		
	}

	@Override
	public void searchEvent() {
		
		
	}

}
