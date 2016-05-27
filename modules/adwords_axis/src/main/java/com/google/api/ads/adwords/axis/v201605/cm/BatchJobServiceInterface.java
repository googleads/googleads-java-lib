/**
 * BatchJobServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;

public interface BatchJobServiceInterface extends java.rmi.Remote {

    /**
     * Query the status of existing {@code BatchJob}s.
     *         
     *         
     * @param selector The selector specifying the {@code BatchJob}s to return.
     * 
     * @return The list of selected jobs.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BatchJobPage get(com.google.api.ads.adwords.axis.v201605.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Creates or updates a {@code BatchJob}.
     *         
     *         <p class="note"><b>Note:</b> {@link BatchJobOperation} does
     * not support the
     *         {@code REMOVE} operator. It is not necessary to remove BatchJobs.
     * 
     *         
     * @param operations A list of operations.
     *         
     * @return The list of created or updated jobs.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BatchJobReturnValue mutate(com.google.api.ads.adwords.axis.v201605.cm.BatchJobOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;

    /**
     * Returns the list of {@code BatchJob}s that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return The list of selected jobs.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching
     *         batchjob information.
     */
    public com.google.api.ads.adwords.axis.v201605.cm.BatchJobPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201605.cm.ApiException;
}
