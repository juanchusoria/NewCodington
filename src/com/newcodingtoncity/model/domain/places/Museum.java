package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;

/**
 * MUSEUM class inherits common behavior from BUILDING class
 * and has its own properties "type"
 */
public class Museum extends Building {

	private String museumName;
	private String type; 
	
	public Museum(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone, String museumName, String image ) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		this.museumName = museumName;
		this.type = type;
		super.setZone(Zone.NORTH);
	}
	// GETTER and SETTER methods of encapsulated fields
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMuseumName() {
		return museumName;
	}
	public void setMuseumName(String museumName) {
		this.museumName = museumName;
	}

	@Override
	public void showEvents() {
		
	}	
}
