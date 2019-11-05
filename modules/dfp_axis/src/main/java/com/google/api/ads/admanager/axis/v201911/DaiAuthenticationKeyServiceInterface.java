// Copyright 2019 Google LLC
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
 * DaiAuthenticationKeyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;

public interface DaiAuthenticationKeyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link DaiAuthenticationKey} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link DaiAuthenticationKey#name}
     *         </ul>
     *         
     *         
     * @param daiAuthenticationKeys the DAI authentication keys to create
     * 
     * @return the created DAI authentication keys with their IDs filled
     * in
     */
    public com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKey[] createDaiAuthenticationKeys(com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKey[] daiAuthenticationKeys) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Gets a {@link DaiAuthenticationKeyPage} of {@link DaiAuthenticationKey}
     * objects that satisfy
     *         the given {@link Statement#query}. The following fields are
     * supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link DaiAuthenticationKey#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link DaiAuthenticationKey#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link DaiAuthenticationKey#name}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement to filter
     * a list of DAI
     *         authentication keys
     *         
     * @return the DAI authentication keys that match the filter
     */
    public com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKeyPage getDaiAuthenticationKeysByStatement(com.google.api.ads.admanager.axis.v201911.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Performs actions on {@link DaiAuthenticationKey} objects that
     * match the given {@link
     *         Statement#query}.
     *         
     *         <p>DAI authentication keys cannot be deactivated if there
     * are active {@link LiveStreamEvent}s
     *         or Content Sources that are using them.
     *         
     *         
     * @param daiAuthenticationKeyAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of live stream
     *         events
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v201911.UpdateResult performDaiAuthenticationKeyAction(com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKeyAction daiAuthenticationKeyAction, com.google.api.ads.admanager.axis.v201911.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Updates the specified {@link DaiAuthenticationKey} objects.
     * 
     *         
     * @param daiAuthenticationKeys the video DAI authentication keys to
     * update
     *         
     * @return the updated DAI authentication keys
     *         
     * @throws ApiException if there is an error updating the DAI authentication
     * keys
     */
    public com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKey[] updateDaiAuthenticationKeys(com.google.api.ads.admanager.axis.v201911.DaiAuthenticationKey[] daiAuthenticationKeys) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;
}
