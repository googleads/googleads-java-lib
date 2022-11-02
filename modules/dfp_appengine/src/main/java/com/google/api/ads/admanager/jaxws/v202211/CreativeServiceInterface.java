// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

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
 *       Provides methods for adding, updating and retrieving {@link Creative} objects.
 *       
 *       <p>For a creative to run, it must be associated with a {@link LineItem} managed by the {@link
 *       LineItemCreativeAssociationService}.
 *       
 *       <p>Read more about creatives on the <a
 *       href="https://support.google.com/dfp_premium/answer/3185155">DFP Help Center</a>.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeServiceInterface {


    /**
     * 
     *         Creates new {@link Creative} objects.
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202211.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
    @RequestWrapper(localName = "createCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfacecreateCreatives")
    @ResponseWrapper(localName = "createCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfacecreateCreativesResponse")
    public List<Creative> createCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativePage} of {@link Creative} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202211.CreativePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
    @RequestWrapper(localName = "getCreativesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfacegetCreativesByStatement")
    @ResponseWrapper(localName = "getCreativesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfacegetCreativesByStatementResponse")
    public CreativePage getCreativesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link Creative} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param creativeAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202211.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
    @RequestWrapper(localName = "performCreativeAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfaceperformCreativeAction")
    @ResponseWrapper(localName = "performCreativeActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfaceperformCreativeActionResponse")
    public UpdateResult performCreativeAction(
        @WebParam(name = "creativeAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
        CreativeAction creativeAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Creative} objects.
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202211.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
    @RequestWrapper(localName = "updateCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfaceupdateCreatives")
    @ResponseWrapper(localName = "updateCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211", className = "com.google.api.ads.admanager.jaxws.v202211.CreativeServiceInterfaceupdateCreativesResponse")
    public List<Creative> updateCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v202211")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

}
