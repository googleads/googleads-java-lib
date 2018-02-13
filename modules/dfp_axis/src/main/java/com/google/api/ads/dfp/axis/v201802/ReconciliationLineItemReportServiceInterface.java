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
 * ReconciliationLineItemReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ReconciliationLineItemReportServiceInterface extends java.rmi.Remote {

    /**
     * Gets a {@link ReconciliationLineItemReportPage} of {@link ReconciliationLineItemReport}
     * objects that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationLineItemReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationLineItemReport#reconciliationReportId}</td>
     * </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationLineItemReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationLineItemReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link ReconciliationLineItemReport#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalLineItemId}</td>
     *         <td>{@link ReconciliationLineItemReport#proposalLineItemId}</td>
     * </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter the result
     *         
     * @return the {@link ReconciliationLineItemReport} objects that match
     * the given filter
     */
    public com.google.api.ads.dfp.axis.v201802.ReconciliationLineItemReportPage getReconciliationLineItemReportsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates a list of {@link ReconciliationLineItemReport} objects
     * which belong to same
     *         {@link ReconciliationReport}.
     *         
     *         
     * @param reconciliationLineItemReports a list of
     *         {@link ReconciliationLineItemReport reconciliation line item
     * reports} to update
     *         
     * @return the updated {@link ReconciliationLineItemReport} objects
     */
    public com.google.api.ads.dfp.axis.v201802.ReconciliationLineItemReport[] updateReconciliationLineItemReports(com.google.api.ads.dfp.axis.v201802.ReconciliationLineItemReport[] reconciliationLineItemReports) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
