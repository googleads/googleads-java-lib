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
 * ProposalLineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ProposalLineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ProposalLineItem} objects.
     *         
     *         
     * @param proposalLineItems the proposal line items to create
     *         
     * @return the created proposal line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItem[] createProposalLineItems(com.google.api.ads.dfp.axis.v201802.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem}
     * objects
     *         that satisfy the given {@link Statement#query}.  The following
     * fields are supported for
     *         filtering:
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
     *         <td>
     *         {@code useThirdPartyAdServerFromProposal}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using
     * sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#useThirdPartyAdServerFromProposal}</td>
     * </tr>
     *         <tr>
     *         <td>
     *         {@code thirdPartyAdServerId}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using
     * sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code customThirdPartyAdServerName}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposal line items using
     * sales management
     *         </div>
     *         </td>
     *         <td>{@link ProposalLineItem#customThirdPartyAdServerName}</td>
     * </tr>
     *         <tr>
     *         <td>{@code isProgrammatic}</td>
     *         <td>{@link ProposalLineItem#isProgrammatic}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of proposal line items
     *         
     * @return the proposal line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItemPage getProposalLineItemsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on {@link ProposalLineItem} objects that match
     * the given {@link Statement#query}.
     *         
     *         
     * @param proposalLineItemAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of
     *         proposal line items
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performProposalLineItemAction(com.google.api.ads.dfp.axis.v201802.ProposalLineItemAction proposalLineItemAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates the specified {@link ProposalLineItem} objects. If
     * free editing mode is enabled,
     *         this will trigger inventory reservation and cause the proposal
     * to be pushed to DFP again.
     *         
     *         
     * @param proposalLineItems the proposal line items to update
     *         
     * @return the updated proposal line items
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItem[] updateProposalLineItems(com.google.api.ads.dfp.axis.v201802.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
