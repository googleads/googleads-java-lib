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
 * CampaignBidModifierServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface CampaignBidModifierServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of campaign bid modifiers that meet the selector
     * criteria.
     *         
     *         
     * @param selector specifying the {@link CampaignBidModifier}s to return.
     * 
     * @return A list of campaign bid modifiers.
     *         
     * @throws ApiException if problems occurred while fetching campaign
     * bid modifier information.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignBidModifierPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Adds, updates, or deletes campaign bid modifiers.
     *         
     *         
     * @param operations A list of unique operations.
     *         
     * @return The list of updated campaign bid modifiers, returned in the
     * same order as the <code>
     *         operations</code> array.
     *         
     * @throws ApiException if problems occurred while updating campaign
     * bid modifiers information.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignBidModifierReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.CampaignBidModifierOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns a list of {@link CampaignBidModifier}s that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.CampaignBidModifierPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
