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
 * FeedMappingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface FeedMappingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of FeedMappings that meet the selector criteria.
     * 
     *         
     * @param selector Determines which FeedMappings to return. If empty
     * all
     *         FeedMappings are returned.
     *         
     * @return The list of FeedMappings.
     *         
     * @throws ApiException indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedMappingPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Add and remove FeedMappings.
     *         The following {@link Operator}s are supported: ADD, REMOVE.
     * 
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting FeedMappings.
     *         
     * @throws ApiException indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedMappingReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.FeedMappingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of FeedMappings that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns The list of FeedMappings
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedMappingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
