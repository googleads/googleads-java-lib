// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202411;

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
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PublisherQueryLanguageService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202411/PublisherQueryLanguageService?wsdl")
public class PublisherQueryLanguageService
    extends Service
{

    private final static URL PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION;
    private final static QName PUBLISHERQUERYLANGUAGESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202411", "PublisherQueryLanguageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202411/PublisherQueryLanguageService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION = url;
        PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION = e;
    }

    public PublisherQueryLanguageService() {
        super(__getWsdlLocation(), PUBLISHERQUERYLANGUAGESERVICE_QNAME);
    }

    public PublisherQueryLanguageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PublisherQueryLanguageServiceInterface
     */
    @WebEndpoint(name = "PublisherQueryLanguageServiceInterfacePort")
    public PublisherQueryLanguageServiceInterface getPublisherQueryLanguageServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202411", "PublisherQueryLanguageServiceInterfacePort"), PublisherQueryLanguageServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublisherQueryLanguageServiceInterface
     */
    @WebEndpoint(name = "PublisherQueryLanguageServiceInterfacePort")
    public PublisherQueryLanguageServiceInterface getPublisherQueryLanguageServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202411", "PublisherQueryLanguageServiceInterfacePort"), PublisherQueryLanguageServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION!= null) {
            throw PUBLISHERQUERYLANGUAGESERVICE_EXCEPTION;
        }
        return PUBLISHERQUERYLANGUAGESERVICE_WSDL_LOCATION;
    }

}
