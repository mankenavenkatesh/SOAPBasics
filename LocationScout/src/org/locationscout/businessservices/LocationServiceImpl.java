package org.locationscout.businessservices;

import java.util.ArrayList;
import java.util.List;



public class LocationServiceImpl {

	List<String> pools=new ArrayList<>();
	List<String> parks=new ArrayList<>();
	public LocationServiceImpl() {
		pools.add("Pool1");
		pools.add("Pool2");
		pools.add("Pool3");
		
		parks.add("park1");
		parks.add("park2");
		
	}
	/*
	// Gets Products for a given category
	public List<String> getLocations(String category){
		// List<Location> locations=new ArrayList<>();
		// Location location=new Location("CubbonPark", "Park");
		// locations.add(location);
		switch (category) {
		case "Pool":
			return "Pool";
		case "Park":
			return "Park";
		default:
			return "XXX";
		}
	}
	**/
	// Get all categories
	public List<String> getLocationCategories(){
		List<String> locationCategories=new ArrayList<>();
		locationCategories.add("Pool");
		locationCategories.add("Hotel");
		locationCategories.add("Park");
		locationCategories.add("Resort");
		return locationCategories;
	}
	
	// Add New Product to category
	public boolean addProduct(String product, String category){
		switch(category){
			case "Pool":
				pools.add(product);
				break;
			case "Park":
				parks.add(product);
				break;
			default:
				return false;
		}
		return true;
	}
}
