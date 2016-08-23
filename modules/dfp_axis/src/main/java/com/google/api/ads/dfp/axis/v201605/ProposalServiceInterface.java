// Copyright 2016 Google Inc. All Rights Reserved.
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
 * ProposalServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public interface ProposalServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Proposal} objects.
     *         
     *         For each proposal, the following fields are required:
     *         <ul>
     *         <li>{@link Proposal#name}</li>
     *         </ul>
     *         
     *         
     * @param proposals the proposals to create
     *         
     * @return the created proposals with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201605.Proposal[] createProposals(com.google.api.ads.dfp.axis.v201605.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets a {@link ProposalPage} of {@link Proposal} objects that
     * satisfy the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Proposal#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code dfpOrderId}</td>
     *         <td>{@link Proposal#dfpOrderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Proposal#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Proposal#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link Proposal#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code approvalStatus}
     *         <div class="constraint">Only applicable for proposals using
     * sales management</div>
     *         </td>
     *         <td>{@link Proposal#approvalStatus}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Proposal#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code thirdPartyAdServerId}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposals using sales
     * management
     *         </div>
     *         </td>
     *         <td>{@link Proposal#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code customThirdPartyAdServerName}
     *         <div class="constraint">
     *         Only applicable for non-programmatic proposals using sales
     * management
     *         </div>
     *         </td>
     *         <td>{@link Proposal#customThirdPartyAdServerName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code hasOfflineErrors}</td>
     *         <td>{@link Proposal#hasOfflineErrors}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isProgrammatic}</td>
     *         <td>{@link Proposal#isProgrammatic}</td>
     *         </tr>
     *         <tr>
     *         <td>
     *         {@code negotiationStatus}
     *         <div class="constraint">Only applicable for programmatic proposals</div>
     * </td>
     *         <td>{@link ProposalMarketplaceInfo#negotiationStatus}</td>
     * </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of proposals
     *         
     * @return the proposals that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201605.ProposalPage getProposalsByStatement(com.google.api.ads.dfp.axis.v201605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Performs actions on {@link Proposal} objects that match the
     * given {@link Statement#query}.
     *         
     *         The following fields are also required when submitting proposals
     * for approval:
     *         <ul>
     *         <li>{@link Proposal#advertiser}</li>
     *         <li>{@link Proposal#primarySalesperson}</li>
     *         <li>{@link Proposal#primaryTraffickerId}</li>
     *         </ul>
     *         
     *         
     * @param proposalAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of proposals
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201605.UpdateResult performProposalAction(com.google.api.ads.dfp.axis.v201605.ProposalAction proposalAction, com.google.api.ads.dfp.axis.v201605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Updates the specified {@link Proposal} objects.
     *         
     *         
     * @param proposals the proposals to update
     *         
     * @return the updated proposals
     */
    public com.google.api.ads.dfp.axis.v201605.Proposal[] updateProposals(com.google.api.ads.dfp.axis.v201605.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;
}
