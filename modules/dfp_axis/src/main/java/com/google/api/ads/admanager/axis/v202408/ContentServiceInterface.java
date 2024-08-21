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
 * ContentServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public interface ContentServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link ContentPage} of {@link Content} objects that
     * satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     * 
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Content#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Content#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Content#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Content#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastDaiIngestDateTime}</td>
     *         <td>{@link Content#lastDaiIngestDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code daiIngestStatus}</td>
     *         <td>{@link Content#daiIngestStatus}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202408.ContentPage getContentByStatement(com.google.api.ads.admanager.axis.v202408.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202408.ApiException;
}
