// Copyright 2023 Google LLC
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
 * CreativeWrapperServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public interface CreativeWrapperServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code CreativeWrapper} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link CreativeWrapper#labelId}
     *         <li>{@link CreativeWrapper#ordering}
     *         <li>{@link CreativeWrapper#header} or {@link CreativeWrapper#footer}
     * </ul>
     */
    public com.google.api.ads.admanager.axis.v202308.CreativeWrapper[] createCreativeWrappers(com.google.api.ads.admanager.axis.v202308.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Gets a {@link CreativeWrapperPage} of {@link CreativeWrapper}
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
     *         <td>{@link CreativeWrapper#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code labelId}</td>
     *         <td>{@link CreativeWrapper#labelId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CreativeWrapper#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code ordering}</td>
     *         <td>{@link CreativeWrapper#ordering}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202308.CreativeWrapperPage getCreativeWrappersByStatement(com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Performs actions on {@link CreativeWrapper} objects that match
     * the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202308.UpdateResult performCreativeWrapperAction(com.google.api.ads.admanager.axis.v202308.CreativeWrapperAction creativeWrapperAction, com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Updates the specified {@code CreativeWrapper} objects.
     */
    public com.google.api.ads.admanager.axis.v202308.CreativeWrapper[] updateCreativeWrappers(com.google.api.ads.admanager.axis.v202308.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;
}
