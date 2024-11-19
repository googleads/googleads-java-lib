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
 * TargetingPresetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public interface TargetingPresetServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link TargetingPreset} objects.
     */
    public com.google.api.ads.admanager.axis.v202411.TargetingPreset[] createTargetingPresets(com.google.api.ads.admanager.axis.v202411.TargetingPreset[] targetingPresets) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202411.ApiException;

    /**
     * Gets a {@link TargetingPresetPage} of {@link TargetingPreset}
     * objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link TargetingPreset#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link TargetingPreset#name}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202411.TargetingPresetPage getTargetingPresetsByStatement(com.google.api.ads.admanager.axis.v202411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202411.ApiException;

    /**
     * Performs actions on the saved targeting objects that match
     * the given {@code filterStatement}.
     */
    public com.google.api.ads.admanager.axis.v202411.UpdateResult performTargetingPresetAction(com.google.api.ads.admanager.axis.v202411.TargetingPresetAction targetingPresetAction, com.google.api.ads.admanager.axis.v202411.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202411.ApiException;

    /**
     * Updates the specified {@link TargetingPreset} objects.
     */
    public com.google.api.ads.admanager.axis.v202411.TargetingPreset[] updateTargetingPresets(com.google.api.ads.admanager.axis.v202411.TargetingPreset[] targetingPresets) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202411.ApiException;
}
