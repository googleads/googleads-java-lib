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
 * LabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public interface LabelServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Label} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.Label[] createLabels(com.google.api.ads.admanager.axis.v202402.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Gets a {@link LabelPage} of {@link Label} objects that satisfy
     * the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Label#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Label#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Label#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Label#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isActive}</td>
     *         <td>{@link Label#isActive}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202402.LabelPage getLabelsByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Performs actions on {@link Label} objects that match the given
     * {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult performLabelAction(com.google.api.ads.admanager.axis.v202402.LabelAction labelAction, com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates the specified {@link Label} objects.
     */
    public com.google.api.ads.admanager.axis.v202402.Label[] updateLabels(com.google.api.ads.admanager.axis.v202402.Label[] labels) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
