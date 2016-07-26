package org.locationscout.locations;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.locationscout.businessservices.LocationServiceImpl;

@WebService
public class LocationCatalog {

	LocationServiceImpl locationService=new LocationServiceImpl();
	
	@WebMethod
	public List<String> getLocationCategories(){
		
		return locationService.getLocationCategories();
		
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		
		return locationService.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String product,String category){
		return locationService.addProduct(product, category);
	}
}
