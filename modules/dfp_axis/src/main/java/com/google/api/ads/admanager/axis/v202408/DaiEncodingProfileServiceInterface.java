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
 * DaiEncodingProfileServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public interface DaiEncodingProfileServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link DaiEncodingProfile} objects.
     */
    public com.google.api.ads.admanager.axis.v202408.DaiEncodingProfile[] createDaiEncodingProfiles(com.google.api.ads.admanager.axis.v202408.DaiEncodingProfile[] daiEncodingProfiles) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Gets a {@link DaiEncodingProfilePage} of {@link DaiEncodingProfile}
     * objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link DaiEncodingProfile#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link DaiEncodingProfile#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link DaiEncodingProfile#name}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202408.DaiEncodingProfilePage getDaiEncodingProfilesByStatement(com.google.api.ads.admanager.axis.v202408.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Performs actions on {@link DaiEncodingProfile} objects that
     * match the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202408.UpdateResult performDaiEncodingProfileAction(com.google.api.ads.admanager.axis.v202408.DaiEncodingProfileAction daiEncodingProfileAction, com.google.api.ads.admanager.axis.v202408.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;

    /**
     * Updates the specified {@link DaiEncodingProfile} objects.
     */
    public com.google.api.ads.admanager.axis.v202408.DaiEncodingProfile[] updateDaiEncodingProfiles(com.google.api.ads.admanager.axis.v202408.DaiEncodingProfile[] daiEncodingProfiles) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;
}
