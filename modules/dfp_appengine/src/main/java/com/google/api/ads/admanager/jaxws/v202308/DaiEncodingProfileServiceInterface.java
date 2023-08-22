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
 *       Provides methods for creating, updating and retrieving {@link DaiEncodingProfile} objects.
 *       
 *       <p>This feature is not yet openly available for GAM Video publishers. Publishers will need to
 *       apply for access for this feature through their account managers.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DaiEncodingProfileServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DaiEncodingProfileServiceInterface {


    /**
     * 
     *         Creates new {@link DaiEncodingProfile} objects.
     *       
     * 
     * @param daiEncodingProfiles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfile>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
    @RequestWrapper(localName = "createDaiEncodingProfiles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfacecreateDaiEncodingProfiles")
    @ResponseWrapper(localName = "createDaiEncodingProfilesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfacecreateDaiEncodingProfilesResponse")
    public List<DaiEncodingProfile> createDaiEncodingProfiles(
        @WebParam(name = "daiEncodingProfiles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
        List<DaiEncodingProfile> daiEncodingProfiles)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link DaiEncodingProfilePage} of {@link DaiEncodingProfile} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link DaiEncodingProfile#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link DaiEncodingProfile#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link DaiEncodingProfile#name}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfilePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
    @RequestWrapper(localName = "getDaiEncodingProfilesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfacegetDaiEncodingProfilesByStatement")
    @ResponseWrapper(localName = "getDaiEncodingProfilesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfacegetDaiEncodingProfilesByStatementResponse")
    public DaiEncodingProfilePage getDaiEncodingProfilesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link DaiEncodingProfile} objects that match the given {@link
     *         Statement#query}.
     *       
     * 
     * @param daiEncodingProfileAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202308.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
    @RequestWrapper(localName = "performDaiEncodingProfileAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfaceperformDaiEncodingProfileAction")
    @ResponseWrapper(localName = "performDaiEncodingProfileActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfaceperformDaiEncodingProfileActionResponse")
    public UpdateResult performDaiEncodingProfileAction(
        @WebParam(name = "daiEncodingProfileAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
        DaiEncodingProfileAction daiEncodingProfileAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link DaiEncodingProfile} objects.
     *       
     * 
     * @param daiEncodingProfiles
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfile>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
    @RequestWrapper(localName = "updateDaiEncodingProfiles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfaceupdateDaiEncodingProfiles")
    @ResponseWrapper(localName = "updateDaiEncodingProfilesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308", className = "com.google.api.ads.admanager.jaxws.v202308.DaiEncodingProfileServiceInterfaceupdateDaiEncodingProfilesResponse")
    public List<DaiEncodingProfile> updateDaiEncodingProfiles(
        @WebParam(name = "daiEncodingProfiles", targetNamespace = "https://www.google.com/apis/ads/publisher/v202308")
        List<DaiEncodingProfile> daiEncodingProfiles)
        throws ApiException_Exception
    ;

}
