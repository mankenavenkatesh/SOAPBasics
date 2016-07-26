package org.soap.client;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		if(args.length!=1){
			System.out.println("You need to pass one IP Address");
		}
		else
		{
			String ipAddress=args[0];
			GeoIPService ipService=new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap=ipService.getGeoIPServiceSoap();
			GeoIP geoIP= geoIPServiceSoap.getGeoIP(ipAddress);
			String country=geoIP.getCountryName();
			System.out.println(country);
		}
		
	}
}
