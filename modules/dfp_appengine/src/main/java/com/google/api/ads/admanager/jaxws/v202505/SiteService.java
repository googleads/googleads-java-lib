// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202505;

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
@WebServiceClient(name = "SiteService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202505/SiteService?wsdl")
public class SiteService
    extends Service
{

    private final static URL SITESERVICE_WSDL_LOCATION;
    private final static WebServiceException SITESERVICE_EXCEPTION;
    private final static QName SITESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202505", "SiteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202505/SiteService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SITESERVICE_WSDL_LOCATION = url;
        SITESERVICE_EXCEPTION = e;
    }

    public SiteService() {
        super(__getWsdlLocation(), SITESERVICE_QNAME);
    }

    public SiteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SiteServiceInterface
     */
    @WebEndpoint(name = "SiteServiceInterfacePort")
    public SiteServiceInterface getSiteServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202505", "SiteServiceInterfacePort"), SiteServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SiteServiceInterface
     */
    @WebEndpoint(name = "SiteServiceInterfacePort")
    public SiteServiceInterface getSiteServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202505", "SiteServiceInterfacePort"), SiteServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SITESERVICE_EXCEPTION!= null) {
            throw SITESERVICE_EXCEPTION;
        }
        return SITESERVICE_WSDL_LOCATION;
    }

}
