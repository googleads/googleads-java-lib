// Copyright 2021 Google LLC
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
 * CreativeServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202102;

public interface CreativeServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to create
     *         
     * @return the created creatives with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202102.Creative[] createCreatives(com.google.api.ads.admanager.axis.v202102.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202102.ApiException;

    /**
     * Gets a {@link CreativePage} of {@link Creative} objects that
     * satisfy the
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
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of creatives
     *         
     * @return the creatives that match the given filter
     */
    public com.google.api.ads.admanager.axis.v202102.CreativePage getCreativesByStatement(com.google.api.ads.admanager.axis.v202102.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202102.ApiException;

    /**
     * Performs action on {@link Creative} objects that match the
     * given {@link Statement#query}.
     *         
     *         
     * @param creativeAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of creatives
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v202102.UpdateResult performCreativeAction(com.google.api.ads.admanager.axis.v202102.CreativeAction creativeAction, com.google.api.ads.admanager.axis.v202102.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202102.ApiException;

    /**
     * Updates the specified {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to update
     *         
     * @return the updated creatives
     */
    public com.google.api.ads.admanager.axis.v202102.Creative[] updateCreatives(com.google.api.ads.admanager.axis.v202102.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202102.ApiException;
}
