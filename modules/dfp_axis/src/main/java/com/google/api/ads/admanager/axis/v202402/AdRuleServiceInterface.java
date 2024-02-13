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

/**
 * AdRuleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public interface AdRuleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdRule} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.AdRule[] createAdRules(com.google.api.ads.admanager.axis.v202402.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Creates new {@link AdSpot} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.AdSpot[] createAdSpots(com.google.api.ads.admanager.axis.v202402.AdSpot[] adSpots) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Creates new {@link breakTemplate} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.BreakTemplate[] createBreakTemplates(com.google.api.ads.admanager.axis.v202402.BreakTemplate[] breakTemplate) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

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
     */
    public com.google.api.ads.admanager.axis.v202402.AdRulePage getAdRulesByStatement(com.google.api.ads.admanager.axis.v202402.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Gets a {@link AdSpotPage} of {@link AdSpot} objects that satisfy
     * the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202402.AdSpotPage getAdSpotsByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Gets a {@link BreakTemplatePage} of {@link BreakTemplate} objects
     * that satisfy the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202402.BreakTemplatePage getBreakTemplatesByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Performs actions on {@link AdRule} objects that match the given
     * {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult performAdRuleAction(com.google.api.ads.admanager.axis.v202402.AdRuleAction adRuleAction, com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link AdRule} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.AdRule[] updateAdRules(com.google.api.ads.admanager.axis.v202402.AdRule[] adRules) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link AdSpot} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.AdSpot[] updateAdSpots(com.google.api.ads.admanager.axis.v202402.AdSpot[] adSpots) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link breakTemplate} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.BreakTemplate[] updateBreakTemplates(com.google.api.ads.admanager.axis.v202402.BreakTemplate[] breakTemplate) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
