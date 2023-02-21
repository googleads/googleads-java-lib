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
 *       Provides methods for creating, updating and retrieving {@link AdRule} objects.
 *       
 *       <p>Ad rules contain data that the ad server uses to generate a playlist of video ads.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdRuleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdRuleServiceInterface {


    /**
     * 
     *         Creates new {@link AdRule} objects.
     *       
     * 
     * @param adRules
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.AdRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "createAdRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateAdRules")
    @ResponseWrapper(localName = "createAdRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateAdRulesResponse")
    public List<AdRule> createAdRules(
        @WebParam(name = "adRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<AdRule> adRules)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link AdSpot} objects.
     *       
     * 
     * @param adSpots
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.AdSpot>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "createAdSpots", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateAdSpots")
    @ResponseWrapper(localName = "createAdSpotsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateAdSpotsResponse")
    public List<AdSpot> createAdSpots(
        @WebParam(name = "adSpots", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<AdSpot> adSpots)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new {@link breakTemplate} objects.
     *       
     * 
     * @param breakTemplate
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.BreakTemplate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "createBreakTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateBreakTemplates")
    @ResponseWrapper(localName = "createBreakTemplatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacecreateBreakTemplatesResponse")
    public List<BreakTemplate> createBreakTemplates(
        @WebParam(name = "breakTemplate", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<BreakTemplate> breakTemplate)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link AdRulePage} of {@link AdRule} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdRule#id} ({@link AdRule#adRuleId} beginning in v201702)</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdRule#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code priority}</td>
     *         <td>{@link AdRule#priority}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdRule#status}</td>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202302.AdRulePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "getAdRulesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetAdRulesByStatement")
    @ResponseWrapper(localName = "getAdRulesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetAdRulesByStatementResponse")
    public AdRulePage getAdRulesByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link AdSpotPage} of {@link AdSpot} objects that satisfy the given {@link
     *         Statement#query}.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202302.AdSpotPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "getAdSpotsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetAdSpotsByStatement")
    @ResponseWrapper(localName = "getAdSpotsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetAdSpotsByStatementResponse")
    public AdSpotPage getAdSpotsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link BreakTemplatePage} of {@link BreakTemplate} objects that satisfy the given {@link
     *         Statement#query}.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202302.BreakTemplatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "getBreakTemplatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetBreakTemplatesByStatement")
    @ResponseWrapper(localName = "getBreakTemplatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfacegetBreakTemplatesByStatementResponse")
    public BreakTemplatePage getBreakTemplatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link AdRule} objects that match the given {@link Statement#query}.
     *       
     * 
     * @param filterStatement
     * @param adRuleAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202302.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "performAdRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceperformAdRuleAction")
    @ResponseWrapper(localName = "performAdRuleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceperformAdRuleActionResponse")
    public UpdateResult performAdRuleAction(
        @WebParam(name = "adRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        AdRuleAction adRuleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdRule} objects.
     *       
     * 
     * @param adRules
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.AdRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "updateAdRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateAdRules")
    @ResponseWrapper(localName = "updateAdRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateAdRulesResponse")
    public List<AdRule> updateAdRules(
        @WebParam(name = "adRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<AdRule> adRules)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdSpot} objects.
     *       
     * 
     * @param adSpots
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.AdSpot>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "updateAdSpots", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateAdSpots")
    @ResponseWrapper(localName = "updateAdSpotsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateAdSpotsResponse")
    public List<AdSpot> updateAdSpots(
        @WebParam(name = "adSpots", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<AdSpot> adSpots)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link breakTemplate} objects.
     *       
     * 
     * @param breakTemplate
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202302.BreakTemplate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
    @RequestWrapper(localName = "updateBreakTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateBreakTemplates")
    @ResponseWrapper(localName = "updateBreakTemplatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302", className = "com.google.api.ads.admanager.jaxws.v202302.AdRuleServiceInterfaceupdateBreakTemplatesResponse")
    public List<BreakTemplate> updateBreakTemplates(
        @WebParam(name = "breakTemplate", targetNamespace = "https://www.google.com/apis/ads/publisher/v202302")
        List<BreakTemplate> breakTemplate)
        throws ApiException_Exception
    ;

}
