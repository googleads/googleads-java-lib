
package com.google.api.ads.dfp.jaxws.v201505;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "LabelService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201505/LabelService?wsdl")
public class LabelService
    extends Service
{

    private final static URL LABELSERVICE_WSDL_LOCATION;
    private final static WebServiceException LABELSERVICE_EXCEPTION;
    private final static QName LABELSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201505", "LabelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201505/LabelService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LABELSERVICE_WSDL_LOCATION = url;
        LABELSERVICE_EXCEPTION = e;
    }

    public LabelService() {
        super(__getWsdlLocation(), LABELSERVICE_QNAME);
    }

    public LabelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns LabelServiceInterface
     */
    @WebEndpoint(name = "LabelServiceInterfacePort")
    public LabelServiceInterface getLabelServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201505", "LabelServiceInterfacePort"), LabelServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LabelServiceInterface
     */
    @WebEndpoint(name = "LabelServiceInterfacePort")
    public LabelServiceInterface getLabelServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201505", "LabelServiceInterfacePort"), LabelServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LABELSERVICE_EXCEPTION!= null) {
            throw LABELSERVICE_EXCEPTION;
        }
        return LABELSERVICE_WSDL_LOCATION;
    }

}
