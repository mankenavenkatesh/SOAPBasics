package org.locationscout.locations;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class LocationProvider {

	@WebMethod
	@WebResult(partName="locationprovider")
	public String getLocationProvider(@WebParam(partName="location") String location){
		return "venky";
	}
}
