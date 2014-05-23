
package com.google.api.ads.adwords.jaxws.v201402.express;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201402.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201402.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201402.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201402.express package. 
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

    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201402", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201402", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201402", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201402.express
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductServiceServiceInterfaceget }
     * 
     */
    public ProductServiceServiceInterfaceget createProductServiceServiceInterfaceget() {
        return new ProductServiceServiceInterfaceget();
    }

    /**
     * Create an instance of {@link ProductServiceServiceInterfacegetResponse }
     * 
     */
    public ProductServiceServiceInterfacegetResponse createProductServiceServiceInterfacegetResponse() {
        return new ProductServiceServiceInterfacegetResponse();
    }

    /**
     * Create an instance of {@link ProductServicePage }
     * 
     */
    public ProductServicePage createProductServicePage() {
        return new ProductServicePage();
    }

    /**
     * Create an instance of {@link ProductService }
     * 
     */
    public ProductService createProductService() {
        return new ProductService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201402", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201402", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201402", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
