// Copyright 2016 Google Inc. All Rights Reserved.
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
 * MutateJobServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public interface MutateJobServiceInterface extends java.rmi.Remote {

    /**
     * Query the status of existing jobs, both simple and bulk API.
     * <p>Use a {@link JobSelector} to query and return a list which may
     *         contain both {@link BulkMutateJob} and/or {@link SimpleMutateJob}.</p>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Job[] get(com.google.api.ads.adwords.axis.v201601.cm.JobSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

    /**
     * Query mutation results, of a {@code COMPLETED} job.
     *         <p>Use a {@link JobSelector} to query and return either a
     *         {@link BulkMutateResult} or a {@link SimpleMutateResult}.
     * Submit only one job ID
     *         at a time.</p>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.JobResult getResult(com.google.api.ads.adwords.axis.v201601.cm.JobSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

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
    public com.google.api.ads.adwords.axis.v201601.cm.SimpleMutateJob mutate(com.google.api.ads.adwords.axis.v201601.cm.Operation[] operations, com.google.api.ads.adwords.axis.v201601.cm.BulkMutateJobPolicy policy) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;
}
