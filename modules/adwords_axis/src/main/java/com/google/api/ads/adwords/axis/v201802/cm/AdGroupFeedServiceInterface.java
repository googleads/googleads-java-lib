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
 * AdGroupFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface AdGroupFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdGroupFeeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which AdGroupFeeds to return. If empty
     * all
     *         adgroup feeds are returned.
     *         
     * @return The list of AdgroupFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, updates or removes AdGroupFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of AdGroupFeeds that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @returns A list of AdGroupFeed.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching AdGroupFeed.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdGroupFeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
