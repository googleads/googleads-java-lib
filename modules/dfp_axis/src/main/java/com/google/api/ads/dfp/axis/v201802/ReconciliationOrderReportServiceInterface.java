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
 * ReconciliationOrderReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ReconciliationOrderReportServiceInterface extends java.rmi.Remote {

    /**
     * Gets an {@link ReconciliationOrderReportPage} of {@link ReconciliationOrderReport}
     * objects
     *         that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationOrderReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationOrderReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationOrderReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submissionDateTime}</td>
     *         <td>{@link ReconciliationOrderReport#submissionDateTime}</td>
     * </tr>
     *         <tr>
     *         <td>{@code submitterId}</td>
     *         <td>{@link ReconciliationOrderReport#submitterId}</td>
     *         </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field is required and can
     * only be combined with an
     *         {@code AND} to other conditions. Furthermore, the results
     * may only belong to
     *         one {@link ReconciliationReport}.
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of reconciliation order reports.
     *         
     * @return the reconciliation order reports that match the given filter.
     */
    public com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportPage getReconciliationOrderReportsByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Performs actions on the {@link ReconciliationOrderReport} objects
     * that match the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ReconciliationOrderReport#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     * </tr>
     *         </table>
     *         The following statement patterns are supported:
     *         <ul>
     *         <li>reconciliationReportId = :reconciliationReportId AND orderId
     * = :orderId</li>
     *         <li>reconciliationReportId = :reconciliationReportId AND proposalId
     * = :proposalId</li>
     *         <li>reconciliationReportId = :reconciliationReportId
     *         AND (orderId IN (...) OR proposalId IN (...))</li>
     *         </ul>
     *         The IN clause could be expanded to multiple OR expressions
     * like
     *         (orderId = :orderId OR orderId = :orderId OR ...)
     *         Only orders to which the API user has access will be included.
     * 
     *         
     * @param reconciliationOrderReportAction the action to perform.
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of orders and
     *         one reconciliation report.
     *         
     * @return the result of the action performed.
     */
    public com.google.api.ads.dfp.axis.v201802.UpdateResult performReconciliationOrderReportAction(com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReportAction reconciliationOrderReportAction, com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Updates a list of {@link ReconciliationOrderReport reconciliation
     * order reports}
     *         which belong to a {@link ReconciliationReport}.
     *         
     *         
     * @param reconciliationOrderReports a list of
     *         {@link ReconciliationOrderReport reconciliation order reports}
     * to update
     *         
     * @return the updated reconciliation order reports
     */
    public com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReport[] updateReconciliationOrderReports(com.google.api.ads.dfp.axis.v201802.ReconciliationOrderReport[] reconciliationOrderReports) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
