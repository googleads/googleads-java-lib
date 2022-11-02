// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202208;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for adding, updating and retrieving {@link Proposal} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProposalServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProposalServiceInterface {


    /**
     * 
     *         Creates new {@link Proposal} objects.
     *         
     *         For each proposal, the following fields are required:
     *         <ul>
     *         <li>{@link Proposal#name}</li>
     *         </ul>
     *       
     * 
     * @param proposals
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.Proposal>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "createProposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacecreateProposals")
    @ResponseWrapper(localName = "createProposalsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacecreateProposalsResponse")
    public List<Proposal> createProposals(
        @WebParam(name = "proposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<Proposal> proposals)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link MarketplaceCommentPage} of {@link MarketplaceComment} objects that satisfy the
     *         given {@link Statement#query}. This method only returns comments already sent to Marketplace,
     *         local draft {@link ProposalMarketplaceInfo#marketplaceComment} are not included. The following
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
     *         The query must specify a {@code proposalId}, and only supports a subset of PQL syntax:<br>
     *         <code>[WHERE <condition> {AND <condition> ...}]</code><br>
     *         <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *         <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET <offset>}]</code><br>
     *         
     *         <p><code><condition></code><br>
     *         &nbsp;&nbsp;&nbsp;&nbsp; <code>:= <property> = <value></code><br>
     *         <code><condition> := <property> IN <list></code><br>
     *         Only supports {@code ORDER BY} {@link MarketplaceComment#creationTime}.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.MarketplaceCommentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getMarketplaceCommentsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacegetMarketplaceCommentsByStatement")
    @ResponseWrapper(localName = "getMarketplaceCommentsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacegetMarketplaceCommentsByStatementResponse")
    public MarketplaceCommentPage getMarketplaceCommentsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProposalPage} of {@link Proposal} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
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
     *         <div class="constraint">Only applicable for proposals using sales management</div>
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
     *         </td>
     *         <td>{@link ProposalMarketplaceInfo#negotiationStatus}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.ProposalPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "getProposalsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacegetProposalsByStatement")
    @ResponseWrapper(localName = "getProposalsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfacegetProposalsByStatementResponse")
    public ProposalPage getProposalsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Proposal} objects that match the given {@link Statement#query}.
     *         
     *         The following fields are also required when submitting proposals for approval:
     *         <ul>
     *         <li>{@link Proposal#advertiser}</li>
     *         <li>{@link Proposal#primarySalesperson}</li>
     *         <li>{@link Proposal#primaryTraffickerId}</li>
     *         </ul>
     *       
     * 
     * @param filterStatement
     * @param proposalAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202208.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "performProposalAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfaceperformProposalAction")
    @ResponseWrapper(localName = "performProposalActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfaceperformProposalActionResponse")
    public UpdateResult performProposalAction(
        @WebParam(name = "proposalAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        ProposalAction proposalAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Proposal} objects.
     *       
     * 
     * @param proposals
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202208.Proposal>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
    @RequestWrapper(localName = "updateProposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfaceupdateProposals")
    @ResponseWrapper(localName = "updateProposalsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208", className = "com.google.api.ads.admanager.jaxws.v202208.ProposalServiceInterfaceupdateProposalsResponse")
    public List<Proposal> updateProposals(
        @WebParam(name = "proposals", targetNamespace = "https://www.google.com/apis/ads/publisher/v202208")
        List<Proposal> proposals)
        throws ApiException_Exception
    ;

}
