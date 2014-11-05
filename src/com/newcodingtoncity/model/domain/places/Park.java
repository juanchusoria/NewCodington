package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

/**
 * POJO class for PARK domain model
 */
public class Park extends Place {

	// Encapsulated data field in PARK class
	private String parkName;
	
	public Park(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,String image, String parkName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.SOUTH);
		this.parkName = parkName;
	}


	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
		
	}
	
}
