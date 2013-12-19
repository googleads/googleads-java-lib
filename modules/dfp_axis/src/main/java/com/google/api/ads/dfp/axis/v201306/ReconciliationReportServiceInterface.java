/**
 * ReconciliationReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;

public interface ReconciliationReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the {@link ReconciliationReport} object uniquely identified
     * by given ID.
     *         
     *         
     * @param reconciliationReportId the ID of the reconciliation report,
     * which must already exist
     *         
     * @return the {@code ReconciliationReport} uniquely identified by the
     * given ID
     */
    public com.google.api.ads.dfp.axis.v201306.ReconciliationReport getReconciliationReport(java.lang.Long reconciliationReportId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

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
    public com.google.api.ads.dfp.axis.v201306.ReconciliationReportPage getReconciliationReportsByStatement(com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

    /**
     * Updates the specified {@link ReconciliationReport}.
     *         
     *         
     * @param reconciliationReport the reconciliation report to be updated
     * 
     * @return the updated reconciliation report
     */
    public com.google.api.ads.dfp.axis.v201306.ReconciliationReport updateReconciliationReport(com.google.api.ads.dfp.axis.v201306.ReconciliationReport reconciliationReport) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;

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
    public com.google.api.ads.dfp.axis.v201306.ReconciliationReport[] updateReconciliationReports(com.google.api.ads.dfp.axis.v201306.ReconciliationReport[] reconciliationReports) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException;
}
