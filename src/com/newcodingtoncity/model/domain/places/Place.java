package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;

/**
 * Place POJO class for domain model 
 */
public abstract class Place {

	// Encapsulated data fields of PLACE object
	private Event events;
	private String placeName;
	private int capacity;
	private String placeDescription; 
	private String workingHours;
	public enum Zone{ NORTH, SOUTH};
	private Zone zone;
	private String image;

	
	/**
	 * @param events
	 * @param placeName
	 * @param capacity
	 * @param placeDescription
	 * @param workingHours
	 * @param zone
	 */
	public Place(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone, String image) {
		super();
		this.events = events;
		this.placeName = placeName;
		this.capacity = capacity;
		this.placeDescription = placeDescription;
		this.workingHours = workingHours;
		this.zone = zone;
		this.setImage(image);
	}
	// GETTER and SETTER methods for Place class

	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Event getEvents() {
		return events;
	}
	public void setEvents(Event events) {
		this.events = events;
	}


	public String getPlaceDescription() {
		return placeDescription;
	}
	public void setPlaceDescription(String placeDescription) {
		this.placeDescription = placeDescription;
	}


	// Abstract method to be overrided in Subclasses like Stadium, Zoo etc.
	public abstract void showEvents();

	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
