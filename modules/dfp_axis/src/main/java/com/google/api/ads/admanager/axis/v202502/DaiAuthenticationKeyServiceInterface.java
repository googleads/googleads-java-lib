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
 * DaiAuthenticationKeyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public interface DaiAuthenticationKeyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link DaiAuthenticationKey} objects.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link DaiAuthenticationKey#name}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKey[] createDaiAuthenticationKeys(com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKey[] daiAuthenticationKeys) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

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
     */
    public com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyPage getDaiAuthenticationKeysByStatement(com.google.api.ads.admanager.axis.v202502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Performs actions on {@link DaiAuthenticationKey} objects that
     * match the given {@link
     *         Statement#query}.
     *         
     *         <p>DAI authentication keys cannot be deactivated if there
     * are active {@link LiveStreamEvent}s
     *         or Content Sources that are using them.
     */
    public com.google.api.ads.admanager.axis.v202502.UpdateResult performDaiAuthenticationKeyAction(com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyAction daiAuthenticationKeyAction, com.google.api.ads.admanager.axis.v202502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Updates the specified {@link DaiAuthenticationKey} objects.
     */
    public com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKey[] updateDaiAuthenticationKeys(com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKey[] daiAuthenticationKeys) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;
}
