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
 * CreativeWrapperServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface CreativeWrapperServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code CreativeWrapper} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CreativeWrapper#labelId}</li>
     *         <li>{@link CreativeWrapper#ordering}</li>
     *         <li>{@link CreativeWrapper#header} or {@link CreativeWrapper#footer}</li>
     * </ul>
     *         
     *         
     * @param creativeWrappers the creative wrappers to create
     *         
     * @return the creative wrappers with their IDs filled in
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeWrapper[] createCreativeWrappers(com.google.api.ads.dfp.axis.v201802.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link CreativeWrapperPage} of {@link CreativeWrapper}
     * objects that satisfy the given {@link Statement#query}. The following
     * fields are supported for filtering:
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
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of creative wrappers.
     *         
     * @return the creative wrappers that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeWrapperPage getCreativeWrappersByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link CreativeWrapper} objects that match
     * the
     *         given {@link Statement#query}.
     *         
     *         
     * @param creativeWrapperAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performCreativeWrapperAction(com.google.api.ads.dfp.axis.v201802.CreativeWrapperAction creativeWrapperAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@code CreativeWrapper} objects.
     *         
     *         
     * @param creativeWrappers the creative wrappers to update
     *         
     * @return the updated creative wrapper objects
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeWrapper[] updateCreativeWrappers(com.google.api.ads.dfp.axis.v201802.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
