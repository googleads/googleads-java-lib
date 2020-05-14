// Copyright 2020 Google LLC
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

/**
 * AdRuleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;

public interface AdRuleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdRule} objects.
     *         
     *         
     * @param adRules the ad rules to create
     *         
     * @return the created ad rules with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202005.AdRule[] createAdRules(com.google.api.ads.admanager.axis.v202005.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Creates new {@link AdSpot} objects.
     *         
     *         
     * @param adSpots the ad spots to create
     *         
     * @return the created ad spots with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202005.AdSpot[] createAdSpots(com.google.api.ads.admanager.axis.v202005.AdSpot[] adSpots) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Creates new {@link breakTemplate} objects.
     *         
     *         
     * @param breakTemplate the break template to create
     *         
     * @return the created break template with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202005.BreakTemplate[] createBreakTemplates(com.google.api.ads.admanager.axis.v202005.BreakTemplate[] breakTemplate) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets an {@link AdRulePage} of {@link AdRule} objects that satisfy
     * the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdRule#id} ({@link AdRule#adRuleId} beginning in
     * v201702)</td>
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
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of ad rules
     *         
     * @return the ad rules that match the given filter
     *         
     * @throws ApiException if the ID of the active network does not exist
     * or there is a backend error
     */
    public com.google.api.ads.admanager.axis.v202005.AdRulePage getAdRulesByStatement(com.google.api.ads.admanager.axis.v202005.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets a {@link AdSpotPage} of {@link AdSpot} objects that satisfy
     * the given {@link
     *         Statement#query}.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of ad spots
     *         
     * @return the ad spots that match the filter
     */
    public com.google.api.ads.admanager.axis.v202005.AdSpotPage getAdSpotsByStatement(com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets a {@link BreakTemplatePage} of {@link BreakTemplate} objects
     * that satisfy the given {@link
     *         Statement#query}.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of breakTemplate
     *         
     * @return the break template that match the filter
     */
    public com.google.api.ads.admanager.axis.v202005.BreakTemplatePage getBreakTemplatesByStatement(com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Performs actions on {@link AdRule} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param adRuleAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad rules
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v202005.UpdateResult performAdRuleAction(com.google.api.ads.admanager.axis.v202005.AdRuleAction adRuleAction, com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link AdRule} objects.
     *         
     *         
     * @param adRules the ad rules to update
     *         
     * @return the updated ad rules
     *         
     * @throws ApiException if there is an error updating the ad rules
     */
    public com.google.api.ads.admanager.axis.v202005.AdRule[] updateAdRules(com.google.api.ads.admanager.axis.v202005.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link AdSpot} objects.
     *         
     *         
     * @param adSpots the ad spots to update
     *         
     * @return the updated ad spots
     *         
     * @throws ApiException if there is an error updating the ad spots
     */
    public com.google.api.ads.admanager.axis.v202005.AdSpot[] updateAdSpots(com.google.api.ads.admanager.axis.v202005.AdSpot[] adSpots) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link breakTemplate} objects.
     *         
     *         
     * @param breakTemplate the break template to update
     *         
     * @return the updated break template
     */
    public com.google.api.ads.admanager.axis.v202005.BreakTemplate[] updateBreakTemplates(com.google.api.ads.admanager.axis.v202005.BreakTemplate[] breakTemplate) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;
}
