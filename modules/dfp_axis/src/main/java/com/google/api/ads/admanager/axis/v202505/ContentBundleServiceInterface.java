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
 * ContentBundleServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public interface ContentBundleServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ContentBundle} objects.
     */
    public com.google.api.ads.admanager.axis.v202505.ContentBundle[] createContentBundles(com.google.api.ads.admanager.axis.v202505.ContentBundle[] contentBundles) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Gets a {@link ContentBundlePage} of {@link ContentBundle} objects
     * that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentBundle#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentBundle#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ContentBundle#status}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202505.ContentBundlePage getContentBundlesByStatement(com.google.api.ads.admanager.axis.v202505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Performs actions on {@link ContentBundle} objects that match
     * the given {@link Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202505.UpdateResult performContentBundleAction(com.google.api.ads.admanager.axis.v202505.ContentBundleAction contentBundleAction, com.google.api.ads.admanager.axis.v202505.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;

    /**
     * Updates the specified {@link ContentBundle} objects.
     */
    public com.google.api.ads.admanager.axis.v202505.ContentBundle[] updateContentBundles(com.google.api.ads.admanager.axis.v202505.ContentBundle[] contentBundles) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202505.ApiException;
}
