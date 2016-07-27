
package org.locationscout.locations;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.locationscout.locations package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProduct_QNAME = new QName("http://locations.locationscout.org/", "addProduct");
    private final static QName _GetLocationCategoriesResponse_QNAME = new QName("http://locations.locationscout.org/", "getLocationCategoriesResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://locations.locationscout.org/", "addProductResponse");
    private final static QName _GetLocationCategories_QNAME = new QName("http://locations.locationscout.org/", "getLocationCategories");
    private final static QName _GetProductsResponse_QNAME = new QName("http://locations.locationscout.org/", "getProductsResponse");
    private final static QName _GetProducts_QNAME = new QName("http://locations.locationscout.org/", "getProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.locationscout.locations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetLocationCategoriesResponse }
     * 
     */
    public GetLocationCategoriesResponse createGetLocationCategoriesResponse() {
        return new GetLocationCategoriesResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetLocationCategories }
     * 
     */
    public GetLocationCategories createGetLocationCategories() {
        return new GetLocationCategories();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "getLocationCategoriesResponse")
    public JAXBElement<GetLocationCategoriesResponse> createGetLocationCategoriesResponse(GetLocationCategoriesResponse value) {
        return new JAXBElement<GetLocationCategoriesResponse>(_GetLocationCategoriesResponse_QNAME, GetLocationCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "getLocationCategories")
    public JAXBElement<GetLocationCategories> createGetLocationCategories(GetLocationCategories value) {
        return new JAXBElement<GetLocationCategories>(_GetLocationCategories_QNAME, GetLocationCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://locations.locationscout.org/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

}
