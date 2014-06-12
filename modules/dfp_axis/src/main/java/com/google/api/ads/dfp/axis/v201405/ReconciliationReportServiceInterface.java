/**
 * ReconciliationReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;

public interface ReconciliationReportServiceInterface extends java.rmi.Remote {

    /**
     * Gets an {@link ReconciliationReportPage} of {@link ReconciliationReport}
     * objects that satisfy
     *         the given {@link Statement#query}. The following fields are
     * supported for filtering.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDate}</td>
     *         <td>{@link ReconciliationReport#startDate}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of reconciliation reports
     *         
     * @return the reconciliation reports that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201405.ReconciliationReportPage getReconciliationReportsByStatement(com.google.api.ads.dfp.axis.v201405.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;

    /**
     * Updates the specified {@link ReconciliationReport} objects.
     * 
     *         
     * @param reconciliationReports the reconciliation reports to update
     *         
     * @return the updated reconciliation reports
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201405.ReconciliationReport[] updateReconciliationReports(com.google.api.ads.dfp.axis.v201405.ReconciliationReport[] reconciliationReports) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201405.ApiException;
}
