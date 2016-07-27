
package org.locationscout.locations;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocationCatalog", targetNamespace = "http://locations.locationscout.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationCatalog {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLocationCategories", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.GetLocationCategories")
    @ResponseWrapper(localName = "getLocationCategoriesResponse", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.GetLocationCategoriesResponse")
    @Action(input = "http://locations.locationscout.org/LocationCatalog/getLocationCategoriesRequest", output = "http://locations.locationscout.org/LocationCatalog/getLocationCategoriesResponse")
    public List<String> getLocationCategories();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.GetProductsResponse")
    @Action(input = "http://locations.locationscout.org/LocationCatalog/getProductsRequest", output = "http://locations.locationscout.org/LocationCatalog/getProductsResponse")
    public List<String> getProducts(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://locations.locationscout.org/", className = "org.locationscout.locations.AddProductResponse")
    @Action(input = "http://locations.locationscout.org/LocationCatalog/addProductRequest", output = "http://locations.locationscout.org/LocationCatalog/addProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}