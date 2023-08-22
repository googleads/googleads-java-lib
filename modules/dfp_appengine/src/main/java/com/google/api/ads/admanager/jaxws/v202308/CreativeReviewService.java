// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

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
@WebServiceClient(name = "CreativeReviewService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202308/CreativeReviewService?wsdl")
public class CreativeReviewService
    extends Service
{

    private final static URL CREATIVEREVIEWSERVICE_WSDL_LOCATION;
    private final static WebServiceException CREATIVEREVIEWSERVICE_EXCEPTION;
    private final static QName CREATIVEREVIEWSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202308", "CreativeReviewService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202308/CreativeReviewService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREATIVEREVIEWSERVICE_WSDL_LOCATION = url;
        CREATIVEREVIEWSERVICE_EXCEPTION = e;
    }

    public CreativeReviewService() {
        super(__getWsdlLocation(), CREATIVEREVIEWSERVICE_QNAME);
    }

    public CreativeReviewService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CreativeReviewServiceInterface
     */
    @WebEndpoint(name = "CreativeReviewServiceInterfacePort")
    public CreativeReviewServiceInterface getCreativeReviewServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202308", "CreativeReviewServiceInterfacePort"), CreativeReviewServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreativeReviewServiceInterface
     */
    @WebEndpoint(name = "CreativeReviewServiceInterfacePort")
    public CreativeReviewServiceInterface getCreativeReviewServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202308", "CreativeReviewServiceInterfacePort"), CreativeReviewServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREATIVEREVIEWSERVICE_EXCEPTION!= null) {
            throw CREATIVEREVIEWSERVICE_EXCEPTION;
        }
        return CREATIVEREVIEWSERVICE_WSDL_LOCATION;
    }

}
