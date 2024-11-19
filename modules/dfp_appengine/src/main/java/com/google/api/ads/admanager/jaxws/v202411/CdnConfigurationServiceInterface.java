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

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link CdnConfiguration} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CdnConfigurationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CdnConfigurationServiceInterface {


    /**
     * 
     *         Creates new {@link CdnConfiguration} objects.
     *       
     * 
     * @param cdnConfigurations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.CdnConfiguration>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "createCdnConfigurations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfacecreateCdnConfigurations")
    @ResponseWrapper(localName = "createCdnConfigurationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfacecreateCdnConfigurationsResponse")
    public List<CdnConfiguration> createCdnConfigurations(
        @WebParam(name = "cdnConfigurations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<CdnConfiguration> cdnConfigurations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CdnConfigurationPage} of {@link CdnConfiguration} objects that satisfy the given
     *         {@link Statement#query}. Currently only CDN Configurations of type {@link
     *         CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT} will be returned. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CdnConfiguration#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CdnConfiguration#name}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "getCdnConfigurationsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfacegetCdnConfigurationsByStatement")
    @ResponseWrapper(localName = "getCdnConfigurationsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfacegetCdnConfigurationsByStatementResponse")
    public CdnConfigurationPage getCdnConfigurationsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link CdnConfiguration} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param cdnConfigurationAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "performCdnConfigurationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfaceperformCdnConfigurationAction")
    @ResponseWrapper(localName = "performCdnConfigurationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfaceperformCdnConfigurationActionResponse")
    public UpdateResult performCdnConfigurationAction(
        @WebParam(name = "cdnConfigurationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        CdnConfigurationAction cdnConfigurationAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link CdnConfiguration} objects.
     *       
     * 
     * @param cdnConfigurations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.CdnConfiguration>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "updateCdnConfigurations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfaceupdateCdnConfigurations")
    @ResponseWrapper(localName = "updateCdnConfigurationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CdnConfigurationServiceInterfaceupdateCdnConfigurationsResponse")
    public List<CdnConfiguration> updateCdnConfigurations(
        @WebParam(name = "cdnConfigurations", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<CdnConfiguration> cdnConfigurations)
        throws ApiException_Exception
    ;

}
