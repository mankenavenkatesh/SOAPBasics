package org.soap.client;

import java.util.List;

import org.locationscout.locations.LocationCatalog;
import org.locationscout.locations.LocationCatalogService;
public class LocationScouterClient {

	public static void main(String[] args){
		LocationCatalogService locationService=new LocationCatalogService();
		LocationCatalog locationCatalog=locationService.getLocationCatalogPort();
		List<String> locationCategories=locationCatalog.getLocationCategories();
		System.out.println(locationCategories);
				
	}
}
