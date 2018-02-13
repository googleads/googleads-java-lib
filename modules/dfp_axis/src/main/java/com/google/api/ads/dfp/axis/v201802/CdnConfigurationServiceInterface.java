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
 * CdnConfigurationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface CdnConfigurationServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link CdnConfiguration} objects.
     */
    public com.google.api.ads.dfp.axis.v201802.CdnConfiguration[] createCdnConfigurations(com.google.api.ads.dfp.axis.v201802.CdnConfiguration[] cdnConfigurations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link CdnConfigurationPage} of {@link CdnConfiguration}
     * objects that satisfy the given
     *         {@link Statement#query}. Currently only CDN Configurations
     * of type {@link
     *         CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT} will be returned.
     * The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CdnConfiguration#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CdnConfiguration#name}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.dfp.axis.v201802.CdnConfigurationPage getCdnConfigurationsByStatement(com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link CdnConfiguration} objects.
     */
    public com.google.api.ads.dfp.axis.v201802.CdnConfiguration[] updateCdnConfigurations(com.google.api.ads.dfp.axis.v201802.CdnConfiguration[] cdnConfigurations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
