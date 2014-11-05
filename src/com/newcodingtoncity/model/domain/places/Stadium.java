package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;


/**
 * class STADIUM takes properties BUILDING
 */
public class Stadium extends Building {

	// Encapsulated data field for Stadium
	private String stadiumName;

	public Stadium(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone, String image, String stadiumName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.NORTH);
		this.stadiumName = stadiumName;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}	
	
	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
		
	}
	
}
