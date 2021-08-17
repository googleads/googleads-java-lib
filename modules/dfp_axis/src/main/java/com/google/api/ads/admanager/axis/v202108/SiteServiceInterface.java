// Copyright 2021 Google LLC
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
 * SiteServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202108;

public interface SiteServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Site} objects.
     *         
     *         
     * @param sites the sites to create
     *         
     * @return the created sites with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202108.Site[] createSites(com.google.api.ads.admanager.axis.v202108.Site[] sites) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Gets a {@link SitePage} of {@link Site} objects that satisfy
     * the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
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
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of sites
     *         
     * @return the sites that match the given filter
     */
    public com.google.api.ads.admanager.axis.v202108.SitePage getSitesByStatement(com.google.api.ads.admanager.axis.v202108.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Performs actions on {@link Site} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param siteAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of sites
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v202108.UpdateResult performSiteAction(com.google.api.ads.admanager.axis.v202108.SiteAction siteAction, com.google.api.ads.admanager.axis.v202108.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Updates the specified {@link Site} objects.
     *         
     *         <p>The {@link Site#childNetworkCode} can be updated in order
     * to 1) change the child network, 2)
     *         move a site from O&O to represented, or 3) move a site from
     * represented to O&O.
     *         
     *         
     * @param sites the sites to update
     *         
     * @return the updated sites
     */
    public com.google.api.ads.admanager.axis.v202108.Site[] updateSites(com.google.api.ads.admanager.axis.v202108.Site[] sites) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;
}
