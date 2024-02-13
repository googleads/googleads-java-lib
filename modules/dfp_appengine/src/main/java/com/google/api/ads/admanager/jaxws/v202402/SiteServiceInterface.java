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


package com.google.api.ads.admanager.jaxws.v202402;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SiteServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SiteServiceInterface {


    /**
     * 
     *         Creates new {@link Site} objects.
     *       
     * 
     * @param sites
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202402.Site>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "createSites", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfacecreateSites")
    @ResponseWrapper(localName = "createSitesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfacecreateSitesResponse")
    public List<Site> createSites(
        @WebParam(name = "sites", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        List<Site> sites)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link SitePage} of {@link Site} objects that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Site#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code url}</td>
     *         <td>{@link Site#url}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code childNetworkCode}</td>
     *         <td>{@link Site#childNetworkCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link Site#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code active}</td>
     *         <td>{@link Site#active}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedApprovalStatusDateTime}</td>
     *         <td></td>
     *         </tr>
     *         </table>
     *         
     *         Restriction: The {@code lastModifiedApprovalStatusDateTime} PQL property can only be used in a
     *         top-level expression scoping the {@code filterStatement} to {@link Site}s whose {@code
     *         approvalStatus} was modified on or after a specified date and time. (e.x. {@code "WHERE
     *         lastModifiedApprovalStatusDateTime >= '2022-01-01T00:00:00'"}).
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202402.SitePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "getSitesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfacegetSitesByStatement")
    @ResponseWrapper(localName = "getSitesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfacegetSitesByStatementResponse")
    public SitePage getSitesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Site} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param siteAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202402.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "performSiteAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfaceperformSiteAction")
    @ResponseWrapper(localName = "performSiteActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfaceperformSiteActionResponse")
    public UpdateResult performSiteAction(
        @WebParam(name = "siteAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        SiteAction siteAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Site} objects.
     *         
     *         <p>The {@link Site#childNetworkCode} can be updated in order to 1) change the child network, 2)
     *         move a site from O&O to represented, or 3) move a site from represented to O&O.
     *       
     * 
     * @param sites
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202402.Site>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
    @RequestWrapper(localName = "updateSites", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfaceupdateSites")
    @ResponseWrapper(localName = "updateSitesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402", className = "com.google.api.ads.admanager.jaxws.v202402.SiteServiceInterfaceupdateSitesResponse")
    public List<Site> updateSites(
        @WebParam(name = "sites", targetNamespace = "https://www.google.com/apis/ads/publisher/v202402")
        List<Site> sites)
        throws ApiException_Exception
    ;

}
