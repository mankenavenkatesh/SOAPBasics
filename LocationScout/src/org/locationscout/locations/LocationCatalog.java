package org.locationscout.locations;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class LocationCatalog {

	public List<String> getLocationCategories(){
		List<String> locationCategories=new ArrayList<>();
		locationCategories.add("Pool");
		locationCategories.add("Hotel");
		locationCategories.add("Park");
		locationCategories.add("Resort");
		return locationCategories;
	}
}
