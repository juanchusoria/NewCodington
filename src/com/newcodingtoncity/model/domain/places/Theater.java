package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

/**
 * Theater POJO class for domain model 
 */
public class Theater extends Building {

	private String theaterName;
	
	public Theater(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,String image, String theaterName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.NORTH);
		this.theaterName = theaterName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
		
	}

	

	
}
