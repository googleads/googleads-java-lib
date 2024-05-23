// Copyright 2024 Google LLC
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
 * SegmentPopulationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public interface SegmentPopulationServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of {@link SegmentPopulationResults} for the
     * given {@code batchUploadIds}.
     */
    public com.google.api.ads.admanager.axis.v202402.SegmentPopulationResults[] getSegmentPopulationResultsByIds(long[] batchUploadIds) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Performs an action on the uploads denoted by {@code batchUploadIds}.
     */
    public com.google.api.ads.admanager.axis.v202402.UpdateResult performSegmentPopulationAction(com.google.api.ads.admanager.axis.v202402.SegmentPopulationAction action, long[] batchUploadIds) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Updates identifiers in an audience segment.
     *         
     *         <p>The returned {@link SegmentPopulationRequest#batchUploadId}
     * can be used in subsequent
     *         requests to group them together as part of the same batch.
     * The identifiers associated with a
     *         batch will not be processed until {@link #performSegmentPopulationAction}
     * is called with a
     *         ProcessAction. The batch will expire if ProcessAction is not
     * called within the TTL of 5 days.
     */
    public com.google.api.ads.admanager.axis.v202402.SegmentPopulationResponse updateSegmentMemberships(com.google.api.ads.admanager.axis.v202402.SegmentPopulationRequest updateRequest) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
