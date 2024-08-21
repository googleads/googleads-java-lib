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
 * InventoryServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public interface InventoryServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdUnit} objects.
     */
    public com.google.api.ads.admanager.axis.v202408.AdUnit[] createAdUnits(com.google.api.ads.admanager.axis.v202408.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Returns a set of all relevant {@link AdUnitSize} objects.
     *         
     *         <p>The given {@link Statement} is currently ignored but may
     * be honored in future versions.
     */
    public com.google.api.ads.admanager.axis.v202408.AdUnitSize[] getAdUnitSizesByStatement(com.google.api.ads.admanager.axis.v202408.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy
     * the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link AdUnit#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202408.AdUnitPage getAdUnitsByStatement(com.google.api.ads.admanager.axis.v202408.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Performs actions on {@link AdUnit} objects that match the given
     * {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202408.UpdateResult performAdUnitAction(com.google.api.ads.admanager.axis.v202408.AdUnitAction adUnitAction, com.google.api.ads.admanager.axis.v202408.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Updates the specified {@link AdUnit} objects.
     */
    public com.google.api.ads.admanager.axis.v202408.AdUnit[] updateAdUnits(com.google.api.ads.admanager.axis.v202408.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;
}
