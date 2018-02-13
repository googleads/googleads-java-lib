// Copyright 2018 Google Inc. All Rights Reserved.
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface MobileApplicationServiceInterface extends java.rmi.Remote {

    /**
     * Creates and claims {@link MobileApplication mobile applications}
     * to be used for targeting in the network.
     *         
     *         
     * @param mobileApplications the mobileApplications to create
     *         
     * @return the created mobileApplications with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplication[] createMobileApplications(com.google.api.ads.dfp.axis.v201802.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link MobileApplicationPage mobileApplicationPage}
     * of
     *         {@link MobileApplication mobile applications} that satisfy
     * the given {@link Statement}.
     *         The following fields are supported for
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
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of
     *         mobile applications.
     *         
     * @return the mobile applications that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplicationPage getMobileApplicationsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs an action on {@link MobileApplication mobile applications}.
     * 
     *         
     * @param mobileApplicationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of mobile applications.
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performMobileApplicationAction(com.google.api.ads.dfp.axis.v201802.MobileApplicationAction mobileApplicationAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link MobileApplication mobile applications}.
     * 
     *         
     * @param mobileApplications the mobile applications to be updated
     *         
     * @return the updated mobileApplications
     */
    public com.google.api.ads.dfp.axis.v201802.MobileApplication[] updateMobileApplications(com.google.api.ads.dfp.axis.v201802.MobileApplication[] mobileApplications) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
