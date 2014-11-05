package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

/**
 * Zoo class that is composed of SAFARI object
 */
public class Zoo extends Place {
	// Encapsulated data fields for ZOO class
	private String zooName;
	
	public Zoo(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,String image, String zooName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.SOUTH);
		this.zooName = zooName;
	}

	
	// GETTER and SETTER methods for ZOO Data fields

	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
		
	}

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}
	

}
