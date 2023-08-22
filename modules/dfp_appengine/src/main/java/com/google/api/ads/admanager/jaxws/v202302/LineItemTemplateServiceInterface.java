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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link LineItemTemplate} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemTemplateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemTemplateServiceInterface {


    /**
     * 
     *         Gets a {@link LineItemTemplatePage} of {@link LineItemTemplate} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LineItemTemplate#id}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202302.LineItemTemplatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "getLineItemTemplatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.LineItemTemplateServiceInterfacegetLineItemTemplatesByStatement")
    @ResponseWrapper(localName = "getLineItemTemplatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.LineItemTemplateServiceInterfacegetLineItemTemplatesByStatementResponse")
    public LineItemTemplatePage getLineItemTemplatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
