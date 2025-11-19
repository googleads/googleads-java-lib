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

/**
 * SiteServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;

public interface SiteServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Site} objects.
     */
    public com.google.api.ads.admanager.axis.v202511.Site[] createSites(com.google.api.ads.admanager.axis.v202511.Site[] sites) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

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
     *         <td>{@code lastModifiedApprovalStatusDateTime}</td>
     *         <td></td>
     *         </tr>
     *         </table>
     *         
     *         Restriction: The {@code lastModifiedApprovalStatusDateTime}
     * PQL property can only be used in a
     *         top-level expression scoping the {@code filterStatement} to
     * {@link Site}s whose {@code
     *         approvalStatus} was modified on or after a specified date
     * and time. (e.x. {@code "WHERE
     *         lastModifiedApprovalStatusDateTime >= '2022-01-01T00:00:00'"}).
     */
    public com.google.api.ads.admanager.axis.v202511.SitePage getSitesByStatement(com.google.api.ads.admanager.axis.v202511.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Performs actions on {@link Site} objects that match the given
     * {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202511.UpdateResult performSiteAction(com.google.api.ads.admanager.axis.v202511.SiteAction siteAction, com.google.api.ads.admanager.axis.v202511.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;

    /**
     * Updates the specified {@link Site} objects.
     *         
     *         <p>The {@link Site#childNetworkCode} can be updated in order
     * to 1) change the child network, 2)
     *         move a site from O&O to represented, or 3) move a site from
     * represented to O&O.
     */
    public com.google.api.ads.admanager.axis.v202511.Site[] updateSites(com.google.api.ads.admanager.axis.v202511.Site[] sites) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202511.ApiException;
}
