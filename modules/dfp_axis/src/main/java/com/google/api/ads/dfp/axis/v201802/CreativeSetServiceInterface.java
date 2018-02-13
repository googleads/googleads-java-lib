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
 * CreativeSetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface CreativeSetServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link CreativeSet}.
     *         
     *         
     * @param creativeSet the creative set to create
     *         
     * @return the creative set with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeSet createCreativeSet(com.google.api.ads.dfp.axis.v201802.CreativeSet creativeSet) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link CreativeSetPage} of {@link CreativeSet} objects
     * that satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CreativeSet#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CreativeSet#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code masterCreativeId}</td>
     *         <td>{@link CreativeSet#masterCreativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link CreativeSet#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param statement a Publisher Query Language statement used to filter
     * a set of creative sets
     *         
     * @return the creative sets that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeSetPage getCreativeSetsByStatement(com.google.api.ads.dfp.axis.v201802.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link CreativeSet}.
     *         
     *         
     * @param creativeSet the creative set to update
     *         
     * @return the updated creative set
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeSet updateCreativeSet(com.google.api.ads.dfp.axis.v201802.CreativeSet creativeSet) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
