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
 * PlacementServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public interface PlacementServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Placement} objects.
     */
    public com.google.api.ads.admanager.axis.v202508.Placement[] createPlacements(com.google.api.ads.admanager.axis.v202508.Placement[] placements) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Gets a {@link PlacementPage} of {@link Placement} objects that
     * satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Placement#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Placement#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Placement#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code placementCode}</td>
     *         <td>{@link Placement#placementCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Placement#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Placement#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202508.PlacementPage getPlacementsByStatement(com.google.api.ads.admanager.axis.v202508.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Performs actions on {@link Placement} objects that match the
     * given {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202508.UpdateResult performPlacementAction(com.google.api.ads.admanager.axis.v202508.PlacementAction placementAction, com.google.api.ads.admanager.axis.v202508.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;

    /**
     * Updates the specified {@link Placement} objects.
     */
    public com.google.api.ads.admanager.axis.v202508.Placement[] updatePlacements(com.google.api.ads.admanager.axis.v202508.Placement[] placements) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202508.ApiException;
}
