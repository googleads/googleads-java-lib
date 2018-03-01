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
 * CampaignFeedServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CampaignFeedServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignFeeds that meet the selector criteria.
     * 
     *         
     * @param selector Determines which CampaignFeeds to return. If empty
     * all
     *         Campaign feeds are returned.
     *         
     * @return The list of CampaignFeeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, sets or removes CampaignFeeds.
     *         
     *         
     * @param operations The operations to apply.
     *         
     * @return The resulting Feeds.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CampaignFeed}s inside a {@link CampaignFeedPage}
     * that matches
     *         the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
