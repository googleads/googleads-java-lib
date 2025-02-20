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
 * ProposalServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public interface ProposalServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Proposal} objects.
     *         
     *         <p>For each proposal, the following fields are required:
     *         
     *         <ul>
     *         <li>{@link Proposal#name}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202502.Proposal[] createProposals(com.google.api.ads.admanager.axis.v202502.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Gets a {@link MarketplaceCommentPage} of {@link MarketplaceComment}
     * objects that satisfy the
     *         given {@link Statement#query}. This method only returns comments
     * already sent to Marketplace,
     *         local draft {@link ProposalMarketplaceInfo#marketplaceComment}
     * are not included. The following
     *         fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link MarketplaceComment#proposalId}</td>
     *         </tr>
     *         </table>
     *         
     *         The query must specify a {@code proposalId}, and only supports
     * a subset of PQL syntax:<br>
     *         <code>[WHERE <condition> {AND <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *         <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET <offset>}]</code><br>
     * 
     *         <p><code><condition></code><br>
     *         &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
     * <code><condition> := <property> IN <list></code><br>
     *         Only supports {@code ORDER BY} {@link MarketplaceComment#creationTime}.
     */
    public com.google.api.ads.admanager.axis.v202502.MarketplaceCommentPage getMarketplaceCommentsByStatement(com.google.api.ads.admanager.axis.v202502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Gets a {@link ProposalPage} of {@link Proposal} objects that
     * satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
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
     */
    public com.google.api.ads.admanager.axis.v202502.ProposalPage getProposalsByStatement(com.google.api.ads.admanager.axis.v202502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Performs actions on {@link Proposal} objects that match the
     * given {@link Statement#query}.
     *         
     *         <p>The following fields are also required when submitting
     * proposals for approval:
     *         
     *         <ul>
     *         <li>{@link Proposal#advertiser}
     *         <li>{@link Proposal#primarySalesperson}
     *         <li>{@link Proposal#primaryTraffickerId}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202502.UpdateResult performProposalAction(com.google.api.ads.admanager.axis.v202502.ProposalAction proposalAction, com.google.api.ads.admanager.axis.v202502.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;

    /**
     * Updates the specified {@link Proposal} objects.
     */
    public com.google.api.ads.admanager.axis.v202502.Proposal[] updateProposals(com.google.api.ads.admanager.axis.v202502.Proposal[] proposals) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202502.ApiException;
}
