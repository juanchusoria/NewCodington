package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

public class LargeBusiness extends Building{
	
	private String largeBusinessName;
	
	public LargeBusiness(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,
			String image, String largeBusinessName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.NORTH);
		this.setLargeBusinessName(largeBusinessName);
	}

	@Override
	public void showEvents() {		
	}

	public String getLargeBusinessName() {
		return largeBusinessName;
	}

	public void setLargeBusinessName(String largeBusinessName) {
		this.largeBusinessName = largeBusinessName;
	}

}
