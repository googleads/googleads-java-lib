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
 * WorkflowRequestServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface WorkflowRequestServiceInterface extends java.rmi.Remote {

    /**
     * Gets a list of {@link WorkflowRequest} objects that satisfy
     * the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link WorkflowRequest#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code workflowRuleName}</td>
     *         <td>{@link WorkflowRequest#workflowRuleName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityType}</td>
     *         <td>{@link WorkflowRequest#entityType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code entityId}</td>
     *         <td>{@link WorkflowRequest#entityId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code approvalStatus}</td>
     *         <td>{@link WorkflowApprovalRequest#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code conditionStatus}</td>
     *         <td>{@link WorkflowExternalConditionRequest#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link WorkflowRequest#type}</td>
     *         </tr>
     *         </table>
     *         
     *         <p>The {@code type} filter is required in v201705 and earlier.
     * 
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of workflow
     *         requests belonging to an entity
     *         
     * @return the workflow requests that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowRequestPage getWorkflowRequestsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Perform actions on {@link WorkflowRequest} objects that match
     * the given
     *         {@link Statement#query}.
     *         
     *         
     * @param action the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of workflow
     *         requests
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performWorkflowRequestAction(com.google.api.ads.dfp.axis.v201802.WorkflowRequestAction action, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
