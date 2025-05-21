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
 * SuggestedAdUnitServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public interface SuggestedAdUnitServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link SuggestedAdUnitPage} of {@link SuggestedAdUnit}
     * objects that satisfy the filter
     *         query. There is a system-enforced limit of 1000 on the number
     * of suggested ad units that are
     *         suggested at any one time.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         <p><strong>Note:</strong> After API version 201311, the {@code
     * id} field will only be
     *         numerical.
     */
    public com.google.api.ads.admanager.axis.v202505.SuggestedAdUnitPage getSuggestedAdUnitsByStatement(com.google.api.ads.admanager.axis.v202505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Performs actions on {@link SuggestedAdUnit} objects that match
     * the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202505.SuggestedAdUnitUpdateResult performSuggestedAdUnitAction(com.google.api.ads.admanager.axis.v202505.SuggestedAdUnitAction suggestedAdUnitAction, com.google.api.ads.admanager.axis.v202505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;
}
