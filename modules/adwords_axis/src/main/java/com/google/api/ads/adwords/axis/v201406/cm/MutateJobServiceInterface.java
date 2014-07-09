/**
 * MutateJobServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;

public interface MutateJobServiceInterface extends java.rmi.Remote {

    /**
     * Query the status of existing jobs, both simple and bulk API.
     * <p>Use a {@link JobSelector} to query and return a list which may
     *         contain both {@link BulkMutateJob} and/or {@link SimpleMutateJob}.</p>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Job[] get(com.google.api.ads.adwords.axis.v201406.cm.JobSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Query mutation results, of a {@code COMPLETED} job.
     *         <p>Use a {@link JobSelector} to query and return either a
     *         {@link BulkMutateResult} or a {@link SimpleMutateResult}.
     * Submit only one job ID
     *         at a time.</p>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.JobResult getResult(com.google.api.ads.adwords.axis.v201406.cm.JobSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;

    /**
     * Simplified way of submitting a mutation job. The provided list
     * of
     *         operations, if valid, will create a new job with a unique
     * id, which will
     *         be returned. This id can later be used in invocations of
     *         {@link #get} and {@link #getResult}. Policy can optionally
     * be specified.
     *         
     *         <p>When this method returns with success, the job will be
     * in
     *         {@code PROCESSING} or {@code PENDING} state and no further
     * action is
     *         needed for the job to get executed.</p>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.SimpleMutateJob mutate(com.google.api.ads.adwords.axis.v201406.cm.Operation[] operations, com.google.api.ads.adwords.axis.v201406.cm.BulkMutateJobPolicy policy) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
