/**
 * ReportRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public interface ReportRemote extends java.rmi.Remote {

    /**
     * Discover what report IDs are available given a query ID and
     * a date 
     *         range.
     */
    public com.google.api.ads.dfa.axis.v1_20.ReportInfoRecordSet getReportsByCriteria(com.google.api.ads.dfa.axis.v1_20.ReportSearchCriteria reportSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;

    /**
     * Find the execution status of a report and, if the report is
     * complete,
     *         a URL you can use to download the report with, by specifying
     * a report
     *         ID.
     */
    public com.google.api.ads.dfa.axis.v1_20.ReportInfo getReport(com.google.api.ads.dfa.axis.v1_20.ReportRequest reportRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;

    /**
     * Tell Report Central to run a deferred report by specifying
     * a query ID.
     */
    public com.google.api.ads.dfa.axis.v1_20.ReportInfo runDeferredReport(com.google.api.ads.dfa.axis.v1_20.ReportRequest reportRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException;
}
