package org.locationscout.locations;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.locationscout.businessservices.LocationServiceImpl;

@WebService(serviceName="LocationService", targetNamespace="http://www.locationscout.com")
public class LocationCatalog {

	LocationServiceImpl locationService=new LocationServiceImpl();
	
	@WebMethod(action="fetch_locations", operationName="fetchLocations")
	public List<String> getLocationCategories(){
		
		return locationService.getLocationCategories();
		
	}
	
	@WebMethod(exclude=true)
	public List<String> getLocations(String category){
		return new ArrayList<>();
		// return locationService.getLocations(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProduct(String product,String category){
		return locationService.addProduct(product, category);
	}
}
