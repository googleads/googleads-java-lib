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
 * CustomerFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CustomerFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of customer feeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which customer feeds to return. If empty,
     * all
     *         customer feeds are returned.
     *         
     * @return The list of customer feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerFeedPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, sets, or removes customer feeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CustomerFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of customer feeds that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of CustomerFeed.
     *         
     * @throws ApiException If problems occur while parsing the query or
     * fetching CustomerFeed.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CustomerFeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
