package com.newcodingtoncity.model.domain.places;

import com.newcodingtoncity.model.domain.Event;
import com.newcodingtoncity.model.domain.places.Place.Zone;

public class TraditionalMarket extends Place{
	private String traditionalMarketName;
	
	public TraditionalMarket(Event events, String placeName, int capacity,
			String placeDescription, String workingHours, Zone zone,
			String image, String traditionalMarketName) {
		super(events, placeName, capacity, placeDescription, workingHours, zone, image);
		super.setZone(Zone.SOUTH);
		this.setTraditionalMarketName(traditionalMarketName);
	}

	@Override
	public void showEvents() {
		
	}

	public String getTraditionalMarketName() {
		return traditionalMarketName;
	}

	public void setTraditionalMarketName(String traditionalMarketName) {
		this.traditionalMarketName = traditionalMarketName;
	}

}
