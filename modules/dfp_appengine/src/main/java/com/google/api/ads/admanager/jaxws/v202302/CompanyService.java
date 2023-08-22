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


package com.google.api.ads.admanager.jaxws.v202302;

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
@WebServiceClient(name = "CompanyService", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v202302/CompanyService?wsdl")
public class CompanyService
    extends Service
{

    private final static URL COMPANYSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPANYSERVICE_EXCEPTION;
    private final static QName COMPANYSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v202302", "CompanyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v202302/CompanyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPANYSERVICE_WSDL_LOCATION = url;
        COMPANYSERVICE_EXCEPTION = e;
    }

    public CompanyService() {
        super(__getWsdlLocation(), COMPANYSERVICE_QNAME);
    }

    public CompanyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CompanyServiceInterface
     */
    @WebEndpoint(name = "CompanyServiceInterfacePort")
    public CompanyServiceInterface getCompanyServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202302", "CompanyServiceInterfacePort"), CompanyServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompanyServiceInterface
     */
    @WebEndpoint(name = "CompanyServiceInterfacePort")
    public CompanyServiceInterface getCompanyServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v202302", "CompanyServiceInterfacePort"), CompanyServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPANYSERVICE_EXCEPTION!= null) {
            throw COMPANYSERVICE_EXCEPTION;
        }
        return COMPANYSERVICE_WSDL_LOCATION;
    }

}
