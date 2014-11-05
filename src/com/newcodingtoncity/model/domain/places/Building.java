package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;

/**
 * Abstract class that governs behavior of STADIUM, THEATER and MUSEUM objects
 */
public abstract class Building extends Place {

	public Building(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone, String image) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param size
	 * method to calculate and showArea of different buildings
	 * that extends behavior from BUILDING classs
	 */
	
	
}
