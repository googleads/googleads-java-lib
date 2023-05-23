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


package com.google.api.ads.admanager.jaxws.v202305;

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
 *       Provides methods for creating, updating and retrieving {@link Activity} objects.
 *       
 *       <p>An activity group contains {@link Activity} objects. Activities have a many-to-one
 *       relationship with activity groups, meaning each activity can belong to only one activity group,
 *       but activity groups can have multiple activities. An activity group can be used to manage the
 *       activities it contains.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ActivityServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ActivityServiceInterface {


    /**
     * 
     *         Creates a new {@link Activity} objects.
     *       
     * 
     * @param activities
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202305.Activity>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "createActivities", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfacecreateActivities")
    @ResponseWrapper(localName = "createActivitiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfacecreateActivitiesResponse")
    public List<Activity> createActivities(
        @WebParam(name = "activities", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        List<Activity> activities)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ActivityPage} of {@link Activity} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Activity#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Activity#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code expectedURL}</td>
     *         <td>{@link Activity#expectedURL}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Activity#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code activityGroupId}</td>
     *         <td>{@link Activity#activityGroupId}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202305.ActivityPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "getActivitiesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfacegetActivitiesByStatement")
    @ResponseWrapper(localName = "getActivitiesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfacegetActivitiesByStatementResponse")
    public ActivityPage getActivitiesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Activity} objects.
     *       
     * 
     * @param activities
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202305.Activity>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
    @RequestWrapper(localName = "updateActivities", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfaceupdateActivities")
    @ResponseWrapper(localName = "updateActivitiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305", className = "com.google.api.ads.admanager.jaxws.v202305.ActivityServiceInterfaceupdateActivitiesResponse")
    public List<Activity> updateActivities(
        @WebParam(name = "activities", targetNamespace = "https://www.google.com/apis/ads/publisher/v202305")
        List<Activity> activities)
        throws ApiException_Exception
    ;

}
