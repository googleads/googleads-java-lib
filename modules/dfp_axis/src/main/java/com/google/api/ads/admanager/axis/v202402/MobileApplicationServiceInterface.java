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
 * MobileApplicationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public interface MobileApplicationServiceInterface extends java.rmi.Remote {

    /**
     * Creates and claims {@link MobileApplication mobile applications}
     * to be used for targeting in
     *         the network.
     */
    public com.google.api.ads.admanager.axis.v202402.MobileApplication[] createMobileApplications(com.google.api.ads.admanager.axis.v202402.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Gets a {@link MobileApplicationPage mobileApplicationPage}
     * of {@link MobileApplication mobile
     *         applications} that satisfy the given {@link Statement}. The
     * following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link MobileApplication#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link MobileApplication#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code appStore}</td>
     *         <td>{@link MobileApplication#appStore}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code appStoreId}</td>
     *         <td>{@link MobileApplication#appStoreId}</td>
     *         <tr/>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link MobileApplication#isArchived}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202402.MobileApplicationPage getMobileApplicationsByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Performs an action on {@link MobileApplication mobile applications}.
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult performMobileApplicationAction(com.google.api.ads.admanager.axis.v202402.MobileApplicationAction mobileApplicationAction, com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link MobileApplication mobile applications}.
     */
    public com.google.api.ads.admanager.axis.v202402.MobileApplication[] updateMobileApplications(com.google.api.ads.admanager.axis.v202402.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
