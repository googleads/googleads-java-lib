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
 * ProposalLineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public interface ProposalLineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates makegood proposal line items given the specifications
     * provided.
     */
    public com.google.api.ads.admanager.axis.v202308.ProposalLineItem[] createMakegoods(com.google.api.ads.admanager.axis.v202308.ProposalLineItemMakegoodInfo[] makegoodInfos) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Creates new {@link ProposalLineItem} objects.
     */
    public com.google.api.ads.admanager.axis.v202308.ProposalLineItem[] createProposalLineItems(com.google.api.ads.admanager.axis.v202308.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem}
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
     *         <td>{@link ProposalLineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProposalLineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ProposalLineItem#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ProposalLineItem#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ProposalLineItem#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProposalLineItem#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProposalLineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isProgrammatic}</td>
     *         <td>{@link ProposalLineItem#isProgrammatic}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202308.ProposalLineItemPage getProposalLineItemsByStatement(com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Performs actions on {@link ProposalLineItem} objects that match
     * the given {@link
     *         Statement#query}.
     */
    public com.google.api.ads.admanager.axis.v202308.UpdateResult performProposalLineItemAction(com.google.api.ads.admanager.axis.v202308.ProposalLineItemAction proposalLineItemAction, com.google.api.ads.admanager.axis.v202308.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;

    /**
     * Updates the specified {@link ProposalLineItem} objects.
     */
    public com.google.api.ads.admanager.axis.v202308.ProposalLineItem[] updateProposalLineItems(com.google.api.ads.admanager.axis.v202308.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202308.ApiException;
}
