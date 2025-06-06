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
 *       Provides operations for creating, updating and retrieving {@link AdUnit} objects.
 *       
 *       <p>Line items connect a creative with its associated ad unit through targeting.
 *       
 *       <p>An ad unit represents a piece of inventory within a publisher. It contains all the settings
 *       that need to be associated with the inventory in order to serve ads. For example, the ad unit
 *       contains creative size restrictions and AdSense settings.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "InventoryServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InventoryServiceInterface {


    /**
     * 
     *         Creates new {@link AdUnit} objects.
     *       
     * 
     * @param adUnits
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202505.AdUnit>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
    @RequestWrapper(localName = "createAdUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.CreateAdUnits")
    @ResponseWrapper(localName = "createAdUnitsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.CreateAdUnitsResponse")
    public List<AdUnit> createAdUnits(
        @WebParam(name = "adUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        List<AdUnit> adUnits)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a set of all relevant {@link AdUnitSize} objects.
     *         
     *         <p>The given {@link Statement} is currently ignored but may be honored in future versions.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202505.AdUnitSize>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
    @RequestWrapper(localName = "getAdUnitSizesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.GetAdUnitSizesByStatement")
    @ResponseWrapper(localName = "getAdUnitSizesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.GetAdUnitSizesByStatementResponse")
    public List<AdUnitSize> getAdUnitSizesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link AdUnit#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202505.AdUnitPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
    @RequestWrapper(localName = "getAdUnitsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.GetAdUnitsByStatement")
    @ResponseWrapper(localName = "getAdUnitsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.GetAdUnitsByStatementResponse")
    public AdUnitPage getAdUnitsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link AdUnit} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param adUnitAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202505.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
    @RequestWrapper(localName = "performAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.PerformAdUnitAction")
    @ResponseWrapper(localName = "performAdUnitActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.PerformAdUnitActionResponse")
    public UpdateResult performAdUnitAction(
        @WebParam(name = "adUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        AdUnitAction adUnitAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdUnit} objects.
     *       
     * 
     * @param adUnits
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202505.AdUnit>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
    @RequestWrapper(localName = "updateAdUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.UpdateAdUnits")
    @ResponseWrapper(localName = "updateAdUnitsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505", className = "com.google.api.ads.admanager.jaxws.v202505.UpdateAdUnitsResponse")
    public List<AdUnit> updateAdUnits(
        @WebParam(name = "adUnits", targetNamespace = "https://www.google.com/apis/ads/publisher/v202505")
        List<AdUnit> adUnits)
        throws ApiException_Exception
    ;

}
