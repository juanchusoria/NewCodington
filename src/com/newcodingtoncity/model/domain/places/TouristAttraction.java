package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

public class TouristAttraction extends Place {
	private String touristAttractionName;
	
	public TouristAttraction(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,
			String image, String touristAttractionName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.SOUTH);
		this.setTouristAttractionName(touristAttractionName);
		
	}

	@Override
	public void showEvents() {
		
		
	}

	public String getTouristAttractionName() {
		return touristAttractionName;
	}

	public void setTouristAttractionName(String touristAttractionName) {
		this.touristAttractionName = touristAttractionName;
	}

}
